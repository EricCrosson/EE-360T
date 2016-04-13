package pset4;

import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.JavaClass;

import org.apache.bcel.Repository;

import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.InstructionHandle;

public class GraphGenerator {

    /* TODO: change this */
    public static final boolean DEBUG = true;

    public CFG createCFG(String className) throws ClassNotFoundException {

        CFG cfg = new CFG();
        JavaClass jc = Repository.lookupClass(className);
        ClassGen cg = new ClassGen(jc);
        ConstantPoolGen cpg = cg.getConstantPool();

        for (Method m: cg.getMethods()) {

            MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
            InstructionList il = mg.getInstructionList();
            InstructionHandle[] handles = il.getInstructionHandles();

            for (InstructionHandle ih: handles) {
                int position = ih.getPosition();
                cfg.addNode(position, m, jc);
                Instruction inst = ih.getInstruction();
                // your code goes here
                System.out.format("TODO: implement");
            }
        }
        return cfg;
    }

    public CFG createCFGWithMethodInvocation(String className)
        throws ClassNotFoundException {
        // your code goes here
        System.out.format("TODO: implement");
        return null;
    }

    public static void main(String[] a) throws ClassNotFoundException {

        String prefix = "";
        if (GraphGenerator.DEBUG) {
            prefix = "assignments/src/pset4/input/";
        }

        GraphGenerator gg = new GraphGenerator();
        gg.createCFG(prefix + "pset4.C");
        gg.createCFGWithMethodInvocation(prefix + "pset4.D");
    }
}
