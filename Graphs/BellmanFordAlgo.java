package Graphs;
import java.util.ArrayList;

public class BellmanFordAlgo {

    // Helper class to represent a directed weighted edge
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Function to populate the adjacency list of the graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }

    // Bellman-Ford Algorithm Implementation
    public static void bellmanFord(ArrayList<Edge>[] graph, int src) {
        int V = graph.length; // Total number of vertices in the graph
        int[] dist = new int[V];

        // Step 1: Initialize all distances to Infinity except the source vertex
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            } else {
                dist[i] = 0; // Distance to self is 0
            }
        }

        // Step 2: Relax all edges (V - 1) times
        // Time Complexity: O(V * E)
        for (int k = 0; k < V - 1; k++) {
            // Loop through all vertices
            for (int i = 0; i < V; i++) {
                // Loop through all edges originating from vertex i
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    // Relaxation condition:
                    // Check if node u is reachable and if going through u offers a shorter path to v
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt; // Update distance
                    }
                }
            }
        }

        // Step 3: Check for negative weight cycles
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u = e.src;
                int v = e.dest;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                    System.out.println("Graph contains a negative weight cycle!");
                    return;
                }
            }
        }

        //Detecting Negative Weight Cycle
        for(int j=0; j<graph.length; j++) {
            for(int k=0; k<graph[j].size(); k++) {
                Edge e = graph[j].get(k);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]) {
                    System.out.println("negative weight cycle exists");
                        break;
                }
            }
        }

        // Step 4: Print shortest distances from source node
        System.out.println("Shortest distances from source node " + src + ":");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("To node " + i + " -> " + dist[i]);
        }
    }

    // Main Method
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5; // Number of vertices

        // Create an array of ArrayLists to represent the graph
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Build the graph structure
        createGraph(graph);

        // Run Bellman-Ford starting from source vertex 0
        bellmanFord(graph, 0);
    }
}
