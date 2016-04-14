package pset4;

import static org.junit.Assert.*;
import org.junit.Test;

public class GraphGeneratorTester {

    C c1 = new C();
    C c2 = new C();

    D d1 = new D();
    D d2 = new D();

    public void setUp() throws java.lang.Exception {
    }

    @Test public void TestCFGCreatGraphC() throws ClassNotFoundException {
        GraphGenerator gg = new GraphGenerator();
        gg.createCFG("pset4.C");
    }

    @Test public void TestCFGCreatGraphD() throws ClassNotFoundException {
        GraphGenerator gg = new GraphGenerator();
        gg.createCFGWithMethodInvocation("pset4.D");
    }

    @Test public void TestIsReachableDMainAndFoo() throws ClassNotFoundException {
        GraphGenerator gg = new GraphGenerator();
        CFG cfg = gg.createCFGWithMethodInvocation("pset4.D");
        assertTrue(cfg.isReachable("main", "pset4.D", "foo", "pset4.D"));
    }

    @Test public void TestIsReachableDMainAndBar() throws ClassNotFoundException {
        GraphGenerator gg = new GraphGenerator();
        CFG cfg = gg.createCFGWithMethodInvocation("pset4.D");
        assertTrue(cfg.isReachable("main", "pset4.D", "bar", "pset4.D"));
    }
}
