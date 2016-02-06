package pset1;

import java.util.HashSet;
import java.util.Set;

public class SLList{
    Node header;

    static class Node{
        int elem;
        Node next;
    }

    boolean repOk() {
        // postcondition: returns true iff <this> is an acyclic list, i.e.,
        //                          there is no path from a node to itself,
        //                          and the elements are sorted (<=)
        Set<Node> visited = new HashSet<Node>();
        Node n = header;
        while (n != null) {
            if (!visited.add(n)) {
                return false;
            }
            if (n.next != null) {
                if (n.elem > n.next.elem) return false;
            }
            n = n.next;
        }
        return true;
    }

    void add(int e) {
        // precondition: this.repOk()
        // postcondition: adds <e> in a new node in the list in sorted order;
        //                the rest of the list is unmodified

        Node inserter = new Node();
        inserter.elem = e;
        inserter.next = null;

        /* Trivial case: header is null (list is empty) */
        if (header == null) {
            header = inserter;
            return;
        }
        /* Weird case: new node replaces header (is smallest value) */
        if (e < header.elem) {
            inserter.next = header;
            header = inserter;
        }

        /* Normal case: we must add a node somewhere in header's list. This will
         * be one of two cases */
        Node n = header;
        while (n.next != null && n.next.elem > e) {
            n = n.next;
        }
        /* case 1: add to end */
        if (n.next == null) {
            n.next = inserter;
        }
        /* case 2: insert between two nodes */
        else {
            inserter.next = n.next;
            n.next = inserter;
        }
    }
}
