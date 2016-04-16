package pset5;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.TreeSet;
import java.util.Set;

public class GraphTester {

    // tests for method "addEdge" in class "Graph"
    @Test public void tae0() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1]}");
    }
    // your tests for method "addEdge" in class "Graph" go here

    // you must provide at least 4 test methods;
    // each test method must have at least 1 invocation of addEdge;
    // each test method must have at least 1 test assertion;
    // your test methods must provide full statement coverage of your
    // implementation of addEdge and any helper methods
    // no test method directly invokes any method that is not
    // declared in the Graph class as given in this homework
    // tests for method "reachable" in class "Graph"
    @Test public void tr0() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(0);
        assertTrue(g.reachable(nodes, nodes));
    }

    // your tests for method "reachable" in class "Graph" go here
    // you must provide at least 6 test methods;
    // each test method must have at least 1 invocation of reachable;
    // each test method must have at least 1 test assertion;
    // at least 2 test methods must have at least 1 invocation of addEdge;
    // your test methods must provide full statement coverage of your
    // 2
    // implementation of reachable and any helper methods
    // no test method directly invokes any method that is not
    // declared in the Graph class as given in this homework
}
