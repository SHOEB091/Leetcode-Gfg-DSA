package Graphs;
import java.util.ArrayList;

public class AllPathAlgo {
    
    // Represents a directed connection from a source vertex to a destination vertex
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    
    // Initializes the adjacency list representation of the graph
    
    public static void createGraph(ArrayList<Edge>[] graph) {
        // Step 1: Initialize an empty list at each vertex index to hold its neighbors
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Step 2: Define the edges (represented here as bidirectional/undirected connections)
        // Edge connections for vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // Edge connections for vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // Edge connections for vertex 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // Edge connections for vertex 3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        // Edge connections for vertex 4
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        // Edge connections for vertex 5
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        // Edge connections for vertex 6
        graph[6].add(new Edge(6, 5));
    }

    /**
     * Finds and prints all simple paths from src to tar using DFS + Backtracking.
     * 
     * graph Adjacency list representation of the graph
     * src   Current vertex in the traversal
     * tar   Target destination vertex
     * path  String accumulating the path taken so far
     * vis   Boolean array tracking vertices in the current recursive call stack
     */
    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int tar, String path, boolean[] vis) {
        // Base Case: Target reached; print the full path found and terminate this branch
        if (src == tar) {
            System.out.println(path);
            return;
        }

        // Recursive Case: Explore all outgoing edges from the current vertex
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            // Avoid cycles: only explore neighbors that aren't already in the current path
            if (!vis[e.dest]) {
                // 1. Choose: mark neighbor as visited for the current path
                vis[e.dest] = true;

                // 2. Explore: recursively traverse deeper towards the target
                printAllPaths(graph, e.dest, tar, path + "->" + e.dest, vis);

                // 3. Backtrack (Un-choose): reset visited status so alternate branches can reuse this vertex
                vis[e.dest] = false;
            }
        }
    }

   
    public static void main(String[] args) {
        int V = 7; // Total number of vertices (0 through 6)
        
        // Array of ArrayLists representing the adjacency list
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0; // Starting vertex
        int tar = 5; // Destination vertex

        // Tracks visited vertices in the current recursion stack to avoid infinite loops
        boolean[] vis = new boolean[V];
        
        // Mark the starting vertex as visited before initiating search
        vis[src] = true;

        // Kick off DFS traversal starting from `src`
        printAllPaths(graph, src, tar, "" + src, vis);
    }
}