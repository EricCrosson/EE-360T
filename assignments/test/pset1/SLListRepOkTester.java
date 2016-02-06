package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

/*-- Objectives
 *
 * - each test allocates exactly one list
 * - each test method makes exactly one invocatino to l.repOk
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
        // your code goes here
    }
    // your code goes here
}
