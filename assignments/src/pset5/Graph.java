package pset5;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Graph {

    /** Set of nodes in the graph */
    private Set<Integer> nodes;
    /** Map of each node and the set of nodes connected to it by outgoing edges */
    private Map<Integer, TreeSet<Integer>> edges;

    /** Class invariant: fields {@code nodes} and {@code edges} are non-null */
    public Graph() {
        nodes = new TreeSet<Integer>();
        edges = new TreeMap<Integer, TreeSet<Integer>>();
    }

    /** Return a String representation of this graph */
    public String toString() {
        return String.format("nodes: %s\nedges: %s", 
                             nodes.toString(), edges.toString());
    }
    
    /** Add the node {@code n} to this graph
     *
     * @param n add an unconnected node {@code n} to this graph
     */
    public void addNode(int n) {
        nodes.add(n);
    }

    /** Add a directed edge from node {@code from} to node {@code to} to this
     * graph
     *
     * @param from the origin node of the new edge to add
     * @param to the destination node of the new edge to add
     */
    public void addEdge(int from, int to) {
        addNode(from);
        addNode(to);
        TreeSet<Integer> neighbors = edges.get(from);
        if (neighbors == null) {
            neighbors = new TreeSet<Integer>();
        }
        neighbors.add(to);
        edges.put(from, neighbors);
        /* Ensure to has a non-null edge list */
        neighbors = edges.get(to);
        if (neighbors == null) {
            neighbors = new TreeSet<Integer>();
        }
        edges.put(to, neighbors);
    }

    /** True if
     *  - {@code sources} is a subset of {@code nodes}, and
     *  - {@code targets} is a subset of {@code nodes}, and
     *  - there is some node {@code n} in {@code sources} such that there is a
     *          directed path that starts at {@code n} and ends at {@code m} in
     *          {@code this}
     *
     * @param sources the set of nodes used as a starting point in this search
     * @param targets the set of nodes considered valid end points in this search
     * @return true if 
     *  - {@code sources} is a subset of {@code nodes}, and
     *  - {@code targets} is a subset of {@code nodes}, and
     *  - there is some node {@code n} in {@code sources} such that there is a
     *          directed path that starts at {@code n} and ends at {@code m} in
     *          {@code this}
     */
    public boolean reachable(Set<Integer> sources, Set<Integer> targets) {
        if (sources == null || targets == null) throw new IllegalArgumentException();
        return (subsetOfNodes(sources) && subsetOfNodes(targets) && 
                connectionTo(sources, targets));
    }

    /** True if {@code set} is a subset of {@code this.nodes}
     *
     * @param set the set of nodes to use in the subset comparison
     * @return true if {@code set} is a subset of {@code this.nodes}
     */
    private boolean subsetOfNodes(Set<Integer> set) {
        Set<Integer> unfound = new TreeSet<Integer>();
        for (int find : set) {
            if (!nodes.contains(find)) {
                unfound.add(find);
            }
        }
        return unfound.size() == 0;
    }

    /** True if {@code from} contains a node {@code n} that connects to {@code
     * to}
     *
     * @param from node to examine connections from
     * @param to node to determine if {@code start} can reach
     * @return true if {@code from} contains a node {@code n} that connects to
     * {@code to}
     */
    private boolean connectionTo(Set<Integer> from, Set<Integer> to) {
        for (int m : from) {
            for (int n : to) {
                if (search(m, n)) {
                    return true;
                }
            }
        }
        return false;
    }

    /** True if node {@code start} has a connection to node {@code target}
     *
     * @param start node to examine connections from
     * @param target node to determine if {@code start} can reach
     * @return true if node {@code start} has a connection to node {@code target}
     */
    private boolean search(int start, int target) {
        if (start == target) { return true; }
        for (int s : edges.get(start)) {
            if (search(s, target)) {
                return true;
            }
        }
        return false;
    }
}
