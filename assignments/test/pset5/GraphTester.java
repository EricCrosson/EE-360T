package pset5;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.TreeSet;
import java.util.Set;

// your test methods must provide full statement coverage of your
// implementation of addEdge and any helper methods
// no test method directly invokes any method that is not
// declared in the Graph class as given in this homework

public class GraphTester {

    /* tests for method "addEdge" in class "Graph" */
    @Test public void tae0() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1], 1=[]}");
    }
    // your tests for method "addEdge" in class "Graph" go here
    @Test public void tae1() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        assertEquals(g.toString(), "nodes: [0, 1, 2]\nedges: {0=[1, 2], 1=[], 2=[]}");
    }
    @Test public void tae2() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        assertEquals(g.toString(), "nodes: [0, 1, 2]\nedges: {0=[1], 1=[2], 2=[]}");
    }
    @Test public void tae3() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        assertEquals(g.toString(), "nodes: [0, 1, 2, 3]\nedges: {0=[1], 1=[], 2=[3], 3=[]}");
    }
    @Test public void tae4() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1], 1=[0]}");
    }


    /* tests for method "reachable" in class "Graph" */
    @Test public void tr0() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(0);
        assertTrue(g.reachable(nodes, nodes));
    }

    // your tests for method "reachable" in class "Graph" go here
    // you must provide at least 6 test methods;
    // at least 2 test methods must have at least 1 invocation of addEdge;
    @Test public void tr1() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(1);
        assertFalse(g.reachable(nodes, nodes));
    }
    @Test public void tr2() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(0);
        Set<Integer> targets = new TreeSet<Integer>();
        targets.add(1);
        assertTrue(g.reachable(nodes, targets));
    }
    @Test public void tr3() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(0);
        Set<Integer> targets = new TreeSet<Integer>();
        targets.add(3);
        assertTrue(g.reachable(nodes, targets));
    }
    @Test public void tr4() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(3);
        Set<Integer> targets = new TreeSet<Integer>();
        targets.add(1);
        assertFalse(g.reachable(nodes, targets));
    }
    @Test public void tr5() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(0);
        Set<Integer> targets = new TreeSet<Integer>();
        targets.add(1);
        assertTrue(g.reachable(nodes, targets));
    }
    @Test public void tr6() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(1);
        Set<Integer> targets = new TreeSet<Integer>();
        targets.add(0);
        assertTrue(g.reachable(nodes, targets));
    }
}
