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
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.InvokeInstruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ReturnInstruction;

public class GraphGenerator {

    public static final boolean DEBUG = false;
    public static int DUNCE = Integer.MAX_VALUE;
    public static Map<Method, Integer> dummyPoints = null;

    public GraphGenerator() {
    }

    private void resetDummyPoints() {
        dummyPoints = new HashMap<Method, Integer>();
    }

    public CFG createCFG(String className) throws ClassNotFoundException {

        CFG cfg = new CFG();
        JavaClass jc = Repository.lookupClass(className);
        ClassGen cg = new ClassGen(jc);
        ConstantPoolGen cpg = cg.getConstantPool();
        final int DUMMY = DUNCE;

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
        resetDummyPoints();
        return cfg;
    }

    /* RESUME: create new graph and sew edges onto this graph */
    private int methodCrawler(ConstantPoolGen cpg, JavaClass jc, ClassGen cg, String methodName, CFG cfg) throws ClassNotFoundException {
        int DUMMY = DUNCE;
        Method method = null; 
        for(Method m : cg.getMethods()) {
            if (methodName.equals(m.getName())) {
                method = m;
            }
        }
        MethodGen mg = new MethodGen(method, cg.getClassName(), cpg);
        InstructionList il = mg.getInstructionList();
        InstructionHandle[] handles = il.getInstructionHandles();
        Map<Integer, InstructionHandle> unfound_targets = new HashMap<Integer, InstructionHandle>();

        for (int i=0; i<handles.length; ++i) {
            InstructionHandle insthandle = handles[i];
            Instruction inst = insthandle.getInstruction();
            int position = insthandle.getPosition();
            if (inst instanceof BranchInstruction) {
                /* Branches have two output nodes */
                unfound_targets.put(position, ((BranchInstruction) inst).getTarget());
            } 

            /* If this is the target of a previously-seen branch */
            Iterator<Map.Entry<Integer, InstructionHandle>> iter = unfound_targets.entrySet().iterator();
            while(iter.hasNext()) {
                Map.Entry <Integer, InstructionHandle> entry = iter.next();
                if (entry.getValue() == insthandle) {
                    /* Target found, add an edge */
                    cfg.addEdge(entry.getKey(), position, method, jc);
                    iter.remove();
                }
            }

            /* Non-branches have one output node */
            if (inst instanceof ReturnInstruction) {
                /* If this method has been crawled before, it will already have a DUMMY */
                if (!dummyPoints.containsKey(method)) {
                    cfg.addEdge(position, DUMMY, method, jc);
                    dummyPoints.put(method, DUMMY);
                }
            }
            else if (inst instanceof INVOKESTATIC) {
                if (GraphGenerator.DEBUG) {
                    System.out.println();
                    System.out.format("!!!!>>>>>> IS INVOKING CPG-GENERATOR on method name %s\n", ((InvokeInstruction)inst).getMethodName(cpg));
                    System.out.println();
                    System.out.println();
                }
                String nMethod = ((InvokeInstruction)inst).getMethodName(cpg);
                Method rMethod = methodByName(cg, nMethod);
                int dummy = methodCrawler(cpg, jc, cg, nMethod, cfg);
                cfg.addEdge(position, method, jc, 0, rMethod, Repository.lookupClass(((InvokeInstruction)inst).getClassName(cpg)));
                int endpoint = DUMMY;
                if (i+1 < handles.length) {
                    endpoint = handles[i+1].getPosition();
                }
                cfg.addEdge(dummy, rMethod, Repository.lookupClass(((InvokeInstruction)inst).getClassName(cpg)), endpoint, method, jc);
            }
            else if (i + 1 < handles.length) {
                cfg.addEdge(position, handles[i+1].getPosition(), method, jc);
            }
            else if (i +1 == handles.length) {
                cfg.addEdge(position, DUMMY, method, jc);
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
                        cfg.addEdge(entry.getKey(), handles[i].getPosition(), method, jc);
                        iter.remove();
                    }
                }
            }
        }
    
        /* Return Method corresponding to this methodName */
        return DUMMY;
    }

    public CFG createCFGWithMethodInvocation(String className)
        throws ClassNotFoundException {
        CFG cfg = new CFG();
        JavaClass jc = Repository.lookupClass(className);
        ClassGen cg = new ClassGen(jc);
        ConstantPoolGen cpg = cg.getConstantPool();
        final int DUMMY = Integer.MAX_VALUE;

        if (GraphGenerator.DEBUG) {
            System.out.format("Scanning class %s\n", className);
        }
        Set<Method> starterMethods = new HashSet<Method>(Arrays.asList(cg.getMethods()));
        /* Star methods are methods that are not called by any other methods */
        for (Method m : cg.getMethods()) {
            MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
            InstructionList il = mg.getInstructionList();
            InstructionHandle[] handles = il.getInstructionHandles();
            for (int i = 0; i < handles.length; ++i) {
                Instruction inst = handles[i].getInstruction();
                if (inst instanceof INVOKESTATIC) {
                    String methodName = ((InvokeInstruction)inst).getMethodName(cpg);
                    Iterator<Method> iter = starterMethods.iterator();
                    while (iter.hasNext()) {
                        if (methodName.equals(iter.next().getName())) {
                            iter.remove();
                        }
                    }
                }
            }
        }
        if (GraphGenerator.DEBUG) {
            System.out.println("Starter methods determined to be:");
            System.out.println(starterMethods);
        }
        /* Start Graph Generation */
        for (Method m : starterMethods) {

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
                else if (inst instanceof INVOKESTATIC) {
                    String methodName = ((InvokeInstruction)inst).getMethodName(cpg);
                    if (GraphGenerator.DEBUG) {
                        System.out.println();
                        System.out.format("!!!!>>>>>> IS INVOKING CPG-GENERATOR on method name %s", ((InvokeInstruction)inst).getMethodName(cpg));
                        System.out.println();
                        System.out.println();
                        System.out.println();
                    }
                    int dummy = methodCrawler(cpg, jc, cg, methodName, cfg);
                    cfg.addEdge(position, m, jc, 0, methodByName(cg, methodName), Repository.lookupClass(((InvokeInstruction)inst).getClassName(cpg)));
                    int endpoint = DUMMY;
                    if(i+1 < handles.length) {
                        endpoint = handles[i+1].getPosition();
                    }
                    cfg.addEdge(dummy, methodByName(cg, methodName), Repository.lookupClass(((InvokeInstruction)inst).getClassName(cpg)), endpoint, m, jc);
                }
                else if (i + 1 < handles.length) {
                    cfg.addEdge(position, handles[i+1].getPosition(), m, jc);
                }
                else if (i+1 == handles.length) {
                    cfg.addEdge(position, DUMMY, m, jc);
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
        resetDummyPoints();
        return cfg;
    }

    private Method methodByName(ClassGen cg, String m) {
        for(Method meth : cg.getMethods()) {
            if (m.equals(meth.getName())) {
                return meth;
            }
        }
        return null;
    }

    public static void main(String[] a) throws ClassNotFoundException {

        GraphGenerator gg = new GraphGenerator();
        gg.createCFG("pset4.C");
        gg.createCFGWithMethodInvocation("pset4.D");
    }
}
