// Places this class inside the Graphs package.
package Graphs;

// Imports Java utility classes, including ArrayList.
import java.util.*;

/*
        (0)
       /   \
   10 /     \ 15
     /       \
   (1)-------(2)
     \   20  /
   25 \     / 30
       \   /
        (3)
*/

// Defines a class named GraphImplementation.
public class weightedGraphImplementation {

    // Defines a small class used to represent one graph edge.
    public static class Edge {

        // Stores the vertex where the edge starts.
        int source;

        // Stores the vertex where the edge ends.
        int destination;

        // Stores the weight or cost associated with this edge.
        int weight;

        // Creates an edge using a source vertex, destination vertex, and weight.
        public Edge(int source, int destination, int weight) {

            // Saves the given source value in this edge.
            this.source = source;

            // Saves the given destination value in this edge.
            this.destination = destination;

            // Saves the given weight value in this edge.
            this.weight = weight;
        }
    }

    // Fills the graph array with vertices and their connected edges.
    public static void createGraph(ArrayList<Edge> graph[]) {

        // Visits every position in the graph array.
        for (int i = 0; i < graph.length; i++) {

            // Creates an empty list to store the edges of vertex i.
            graph[i] = new ArrayList<>();
        }

        // --- Edges for Vertex 0 ---
        // Adds an edge from vertex 0 to vertex 1 with weight 10.
        graph[0].add(new Edge(0, 1, 10));

        // Adds an edge from vertex 0 to vertex 2 with weight 15.
        graph[0].add(new Edge(0, 2, 15));

        // --- Edges for Vertex 1 ---
        // Adds the reverse edge from vertex 1 to vertex 0 with matching weight 10.
        graph[1].add(new Edge(1, 0, 10));

        // Adds an edge from vertex 1 to vertex 2 with weight 20.
        graph[1].add(new Edge(1, 2, 20));

        // Adds an edge from vertex 1 to vertex 3 with weight 25.
        graph[1].add(new Edge(1, 3, 25));

        // --- Edges for Vertex 2 ---
        // Adds the reverse edge from vertex 2 to vertex 0 with matching weight 15.
        graph[2].add(new Edge(2, 0, 15));

        // Adds the reverse edge from vertex 2 to vertex 1 with matching weight 20.
        graph[2].add(new Edge(2, 1, 20));

        // Adds an edge from vertex 2 to vertex 3 with weight 30.
        graph[2].add(new Edge(2, 3, 30));

        // --- Edges for Vertex 3 ---
        // Adds the reverse edge from vertex 3 to vertex 1 with matching weight 25.
        graph[3].add(new Edge(3, 1, 25));

        // Adds the reverse edge from vertex 3 to vertex 2 with matching weight 30.
        graph[3].add(new Edge(3, 2, 30));
    }
    // This is where the program starts running.
    public static void main(String[] args) {

        // Sets the graph to contain five vertices: 0, 1, 2, 3, and 4.
        int vertices = 5;

        // Creates an array that will hold one edge list for each vertex.
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        // Builds the graph by adding all vertices' edges.
        createGraph(graph);

        // Goes through every vertex in the graph.
        for (int i = 0; i < graph.length; i++) {

            // Prints the current vertex followed by an arrow.
            System.out.print(i + " -> ");

            // Goes through every edge connected to the current vertex.
            for (Edge edge : graph[i]) {

                // Prints the destination vertex and its weight in readable format.
                System.out.print("(" + edge.destination + ", wt: " + edge.weight + ") ");
            }

            // Moves the output cursor to the next line.
            System.out.println();
        }
    }
}