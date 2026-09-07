package Graphs;
import java.util.*;

public class TopologicalSort {
    // Represents a directed connection from a source node to a destination node
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Initializes the adjacency list array and builds the directed graph structure
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // Initialize an empty list for each node
        }
        
        // Add directed edges: graph[u].add(v) means an edge exists from u to v
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Helper method: performs Depth First Search (DFS) to process nodes
    public static void topoSortUtil(ArrayList<Edge> graph[], boolean visited[], int current, Stack<Integer> s) {
        visited[current] = true; // Mark the current node as visited

        // Explore all outgoing neighbors of the current node
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);

            // Recurse on any unvisited destination node
            if (!visited[e.dest]) {
                topoSortUtil(graph, visited, e.dest, s);
            }
        }
        
        // Push current node to the stack only AFTER all its dependencies/children are visited
        s.push(current);
    }

    // Driver method to setup tracking structures and print final order
    public static void topoSort(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length]; // Tracks visited vertices
        Stack<Integer> s = new Stack<>();             // Stores nodes in post-visit order

        // Loop ensures all disconnected nodes or components are processed
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                topoSortUtil(graph, visited, i, s);
            }
        }

        // Popping from the stack reverses the post-order to give valid topological sorting
        System.out.print("Topological Sort: ");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6; // Total vertices in the graph (0 to 5)
        
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        
        topoSort(graph); // Output: 5 4 2 3 1 0 (or another valid ordering)
    }
}
