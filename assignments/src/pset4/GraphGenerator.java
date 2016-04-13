package pset4;

import java.util.*;

import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.JavaClass;

import org.apache.bcel.Repository;

import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ReturnInstruction;

public class GraphGenerator {

    /* TODO: change this */
    public static final boolean DEBUG = true;

    public CFG createCFG(String className) throws ClassNotFoundException {

        CFG cfg = new CFG();
        JavaClass jc = Repository.lookupClass(className);
        ClassGen cg = new ClassGen(jc);
        ConstantPoolGen cpg = cg.getConstantPool();
        final int DUMMY = Integer.MAX_VALUE;

        if (GraphGenerator.DEBUG) {
            System.out.format("Scanning class %s\n", className);
        }
        for (Method m: cg.getMethods()) {

            MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
            InstructionList il = mg.getInstructionList();
            InstructionHandle[] handles = il.getInstructionHandles();

            /* Since branches can only target within the same method, keep a
                * method-local list of un-found targets */
            Map<Integer, InstructionHandle> unfound_targets = 
                new HashMap<Integer, InstructionHandle>();

            if (GraphGenerator.DEBUG) {
                System.out.format("\tmethod %s\n", m.getName());
            }
            for (int i = 0; i < handles.length; ++i) {
                Instruction inst = handles[i].getInstruction();
                int position = handles[i].getPosition();
                if (GraphGenerator.DEBUG) {
                    System.out.println("Node: " + position);
                }

                if (inst instanceof BranchInstruction) {
                    /* Branches have two output nodes */
                    unfound_targets.put(position, ((BranchInstruction) inst).getTarget());
                } 

                /* If this is the target of a previously-seen branch */
                Iterator<Map.Entry<Integer, InstructionHandle>> iter = unfound_targets.entrySet().iterator();
                while(iter.hasNext()) {
                    Map.Entry <Integer, InstructionHandle> entry = iter.next();
                    if (entry.getValue() == handles[i]) {
                        /* Target found, add an edge */
                        cfg.addEdge(entry.getKey(), position, m, jc);
                        iter.remove();
                    }
                }

                /* Non-branches have one output node */
                if (inst instanceof ReturnInstruction) {
                    cfg.addEdge(position, DUMMY, m, jc);
                } 
                else if (i + 1 < handles.length) {
                    cfg.addEdge(position, handles[i+1].getPosition(), m, jc);
                }

                if (GraphGenerator.DEBUG) {
                    System.out.format("\t\t%s\t%s\n", inst, inst.getOpcode());
                }
            }

            /* Second pass -- if unfound_targets branched upward, they would
             * have been missed by the first pass */
            if (unfound_targets.size() > 0) {
                for(int i = 0; i < handles.length; ++i) {
                    Iterator<Map.Entry<Integer, InstructionHandle>> iter = unfound_targets.entrySet().iterator();
                    while(iter.hasNext()) {
                        Map.Entry <Integer, InstructionHandle> entry = iter.next();
                        if (entry.getValue() == handles[i]) {
                            /* Target found, add an edge */
                            cfg.addEdge(entry.getKey(), handles[i].getPosition(), m, jc);
                            iter.remove();
                        }
                    }
                }
            }
        }
        if (GraphGenerator.DEBUG) {
            System.out.println(cfg);
        }
        return cfg;
    }

    public CFG createCFGWithMethodInvocation(String className)
        throws ClassNotFoundException {
        // your code goes here
        System.out.format("TODO: implement\n");
        return null;
    }

    public static void main(String[] a) throws ClassNotFoundException {

        if (!GraphGenerator.DEBUG) {
            GraphGenerator gg = new GraphGenerator();
            gg.createCFG("pset4.C");
            gg.createCFGWithMethodInvocation("pset4.D");
        }
    }
}
