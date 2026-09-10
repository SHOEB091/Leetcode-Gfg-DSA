package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgoMST {

    // 1. This class represents one road/edge between two points
    public static class Edge {
        int src;   // Where the edge starts
        int dest;  // Where the edge goes
        int wt;    // How much it costs to use this edge (weight)

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // 2. This function builds the graph connections
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Create an empty list for every vertex (0 to 3)
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges between nodes with their weights:
        // Connections for node 0
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        // Connections for node 1
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        // Connections for node 2
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        // Connections for node 3
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    // 3. Helper class to store a node and the cost to connect it
    public static class Pair implements Comparable<Pair> {
        int node; // The node number (e.g. 0, 1, 2, 3)
        int cost; // The edge weight to reach this node

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        // Tells Java: always pick the one with the smallest cost first
        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // Smallest cost comes out first
        }
    }

    // 4. Main Prim's logic to find the cheapest way to connect all nodes
    public static void primsAlgo(ArrayList<Edge> graph[], int V) {
        // PriorityQueue always gives us the cheapest edge available right now
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Tracks which nodes are already added to our tree (prevents making loops/cycles)
        boolean visited[] = new boolean[V];

        // List to remember which nodes we picked and in what order
        ArrayList<Integer> mstVertices = new ArrayList<>();

        // Start from node 0 with 0 cost (since starting point costs nothing)
        pq.add(new Pair(0, 0));
        int mstCost = 0; // Total cost counter

        // Keep running until there are no more edges to check
        while (!pq.isEmpty()) {
            // Pick the cheapest node currently waiting in the queue
            Pair curr = pq.remove();

            // Only process if this node is NOT already in our tree
            if (!visited[curr.node]) {
                // Step A: Mark it as visited so we never pick it again
                visited[curr.node] = true;

                // Step B: Add its cost to our grand total
                mstCost += curr.cost;

                // Step C: Save this node to our final list
                mstVertices.add(curr.node);

                // Step D: Look at all neighbor nodes connected to this current node
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);

                    // If the neighbor is not yet visited, put it in the queue with its weight
                    if (!visited[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        // Print final results
        System.out.println("Vertices in MST (order added): " + mstVertices);
        System.out.println("Minimum cost of MST = " + mstCost);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 4; // Total 4 nodes: 0, 1, 2, 3

        // Make an array of lists to hold the graph
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // Run the algorithm
        primsAlgo(graph, V);
    }
}