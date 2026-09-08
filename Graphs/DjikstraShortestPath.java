package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DjikstraShortestPath {

    // Represents a directed, weighted edge between two vertices
    public static class Edge {
        int src;   // Origin vertex
        int dest;  // Target vertex
        int wt;    // Cost/weight of traversing this edge

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Builds the graph using an Adjacency List
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Step 1: Initialize an empty list for every vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Step 2: Add directed weighted edges: (source, destination, weight)
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    // Helper class to store a vertex and its current shortest distance from the source
    // Implements Comparable so the PriorityQueue knows how to order pairs
    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        // Min-Heap ordering: Smaller distances get higher priority (top of heap)
        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist; // Ascending order
        }
    }

    /**
     * Dijkstra's Algorithm: Finds the shortest path from 'src' to all other nodes.
     * Time Complexity: O(E * log V) using a Min-Heap.
     */
    public static int[] dijkstara(ArrayList<Edge> graph[], int src) {
        // Min-Heap: Always yields the unvisited node with the smallest cumulative distance
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // dist[i] stores the current shortest known distance from src -> i
        int dist[] = new int[graph.length];

        // vis[i] ensures each vertex is permanently finalized only once
        boolean vis[] = new boolean[graph.length];

        // 1. INITIALIZATION:
        // Set all initial distances to infinity, except the source vertex which is 0
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // Sentinel for "unreachable so far"
            }
        }

        // Push source node into the PriorityQueue with distance 0
        pq.add(new Pair(src, 0));

        // 2. BFS TRAVERSAL (using PriorityQueue instead of regular FIFO Queue)
        while (!pq.isEmpty()) {
            // GREEDY CHOICE: Extract the node with the smallest tentative distance
            Pair curr = pq.remove();

            // If already processed via a shorter path, skip to avoid redundant work
            if (!vis[curr.node]) {
                // Mark as visited: Its shortest path from the source is now finalized
                vis[curr.node] = true;

                // 3. RELAXATION STEP:
                // Check all outgoing neighbors of the current vertex
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;   // Current node
                    int v = e.dest;  // Neighbor node

                    // If neighbor is unvisited AND path through 'u' is cheaper than current dist[v]:
                    if (!vis[v] && dist[u] + e.wt < dist[v]) {
                        // Relax the edge (update with the new shorter distance)
                        dist[v] = dist[u] + e.wt;

                        // Add neighbor to the heap with its updated shorter distance
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        return dist;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6; // Graph vertices: 0, 1, 2, 3, 4, 5

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        int dist[] = dijkstara(graph, src);

        // Print final minimum distances from source (0) to all vertices
        System.out.println("Shortest distances from source node " + src + ":");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Node " + i + " -> " + dist[i]);
        }
    }
}