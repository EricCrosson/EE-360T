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

        System.out.format("Scanning class %s\n", className);
        for (Method m: cg.getMethods()) {

            MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
            InstructionList il = mg.getInstructionList();
            InstructionHandle[] handles = il.getInstructionHandles();

            /* Since branches can only target within the same method, keep a
             * method-local list of un-found targets */
            Map<Integer, InstructionHandle> unfound_targets = 
                new HashMap<Integer, InstructionHandle>();

            System.out.format("\tmethod %s\n", m.getName());
            for (int i = 0; i < handles.length; ++i) {
                Instruction inst = handles[i].getInstruction();
                System.out.println("Node: " + i);

                if (inst instanceof BranchInstruction) {
                    /* Branches have two output nodes */
                    unfound_targets.put(i, ((BranchInstruction) inst).getTarget());
                } 

                /* If this is the target of a previously-seen branch */
                for(Map.Entry<Integer, InstructionHandle> entry : unfound_targets.entrySet()) {
                    if (entry.getValue() == handles[i]) {
                        /* Target found, add an edge */
                        cfg.addEdge(entry.getKey(), i, m, jc);
                    }
                }
                /* TODO: how do we handle targets that occur before the
                 * conditional? e.g.: while loop */

                /* Non-branches have one output node */
                if (inst instanceof ReturnInstruction) {
                    cfg.addEdge(i, handles.length, m, jc);
                } 
                else if (i + 1 < handles.length) {
                    cfg.addEdge(i, i+1, m, jc);
                }
                    
                if (GraphGenerator.DEBUG) {
                    System.out.format("\t\t%s\t%s\n", inst, inst.getOpcode());
                }
            }
            /* Switch all connections to the DUMMY node into connections to the
             * RETURN node. */
        }
        System.out.println(cfg);
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
