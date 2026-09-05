// Places this class inside the Graphs package.
package Graphs;

// Imports Java utility classes, including ArrayList.
import java.util.*;

// Defines a class named GraphImplementation.
public class GraphImplementation {

    // Defines a small class used to represent one graph edge.
    public static class Edge {

        // Stores the vertex where the edge starts.
        int source;

        // Stores the vertex where the edge ends.
        int destination;

        // Creates an edge using a source vertex and a destination vertex.
        public Edge(int source, int destination) {

            // Saves the given source value in this edge.
            this.source = source;

            // Saves the given destination value in this edge.
            this.destination = destination;
        }
    }

    // Fills the graph array with vertices and their connected edges.
    public static void createGraph(ArrayList<Edge> graph[]) {

        // Visits every position in the graph array.
        for (int i = 0; i < graph.length; i++) {

            // Creates an empty list to store the edges of vertex i.
            graph[i] = new ArrayList<>();
        }

        // Adds an edge from vertex 0 to vertex 1.
        graph[0].add(new Edge(0, 1));

        // Adds an edge from vertex 0 to vertex 2.
        graph[0].add(new Edge(0, 2));

        // Adds an edge from vertex 0 to vertex 3.
        graph[0].add(new Edge(0, 3));

        // Adds the reverse edge from vertex 1 to vertex 0.
        graph[1].add(new Edge(1, 0));

        // Adds an edge from vertex 1 to vertex 2.
        graph[1].add(new Edge(1, 2));

        // Adds the reverse edge from vertex 2 to vertex 0.
        graph[2].add(new Edge(2, 0));

        // Adds the reverse edge from vertex 2 to vertex 1.
        graph[2].add(new Edge(2, 1));

        // Adds the reverse edge from vertex 3 to vertex 0.
        graph[3].add(new Edge(3, 0));

        // Adds an edge from vertex 3 to vertex 4.
        graph[3].add(new Edge(3, 4));

        // Adds the reverse edge from vertex 4 to vertex 3.
        graph[4].add(new Edge(4, 3));
    }

    // This is where the program starts running.
    public static void main(String[] args) {

        // Sets the graph to contain five vertices: 0, 1, 2, 3, and 4.
        int vertices = 5;

        // Creates an array that will hold one edge list for each vertex.
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        // Builds the graph by adding all vertices' edges.
        createGraph(graph);

        // Goes through every vertex in the graph.
        for (int i = 0; i < graph.length; i++) {

            // Prints the current vertex followed by an arrow.
            System.out.print(i + " -> ");

            // Goes through every edge connected to the current vertex.
            for (Edge edge : graph[i]) {

                // Prints the destination vertex of the current edge.
                System.out.print(edge.destination + " ");
            }

            // Moves the output cursor to the next line.
            System.out.println();
        }
    }
}
