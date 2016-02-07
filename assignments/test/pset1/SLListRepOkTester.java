package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

/*-- Objectives
 *
 * - each test allocates exactly one list
 * - each test method makes exactly one invocation to l.repOk
 * - each test method invokes assertTrue(l.repOk()) as its last statement (or False)
 * - no invocation of add is made in any test method
 * - the test suite as a whole consists of all singly-linked list data
 *   structures (including acyclic) that can possibly be constructed using up to
 *   2 nodes with integer values 0 and 1.
 */

public class SLListRepOkTester {

    @Test public void t0() {

        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    @Test public void t1() {

        SLList l = new SLList();
        Node n = new Node();
        n.elem = 0;
        n.next = null;
        l.header = n;
        assertTrue(l.repOk());
    }

    @Test public void t2() {

        SLList l = new SLList();
        Node n = new Node();
        n.elem = 1;
        n.next = null;
        l.header = n;
        assertTrue(l.repOk());
    }

    @Test public void t3() {

        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        n.elem = 0;
        n.next = m;
        m.elem = 0;
        m.next = null;
        l.header = n;
        assertTrue(l.repOk());
    }

    @Test public void t4() {

        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        n.elem = 0;
        n.next = m;
        m.elem = 1;
        m.next = null;
        l.header = n;
        assertTrue(l.repOk());
    }

    @Test public void t5() {

        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        n.elem = 1;
        n.next = m;
        m.elem = 0;
        m.next = null;
        l.header = n;
        assertFalse(l.repOk());
    }

    @Test public void t6() {

        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        n.elem = 1;
        n.next = m;
        m.elem = 1;
        m.next = null;
        l.header = n;
        assertTrue(l.repOk());
    }

    @Test public void t7() {

        SLList l = new SLList();
        Node n = new Node();
        n.elem = 0;
        n.next = n;
        l.header = n;
        assertFalse(l.repOk());
    }

    @Test public void t8() {

        SLList l = new SLList();
        Node n = new Node();
        n.elem = 1;
        n.next = n;
        l.header = n;
        assertFalse(l.repOk());
    }

    @Test public void t9() {

        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        n.elem = 1;
        n.next = m;
        m.elem = 0;
        m.next = m;
        l.header = n;
        assertFalse(l.repOk());
    }

    @Test public void t10() {

        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        n.elem = 1;
        n.next = m;
        m.elem = 1;
        m.next = m;
        l.header = n;
        assertFalse(l.repOk());
    }

    @Test public void t11() {

        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        n.elem = 0;
        n.next = m;
        m.elem = 0;
        m.next = m;
        l.header = n;
        assertFalse(l.repOk());
    }

    @Test public void t12() {

        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        n.elem = 0;
        n.next = m;
        m.elem = 1;
        m.next = m;
        l.header = n;
        assertFalse(l.repOk());
    }
}
