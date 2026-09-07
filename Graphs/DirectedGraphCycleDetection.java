package Graphs;
import java.util.*;

class DirectedGraphCycleDetect {
    public static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3)); // Fixed semicolon
    }

    public static boolean isCyclicDirected(ArrayList<Edge> graph[], boolean visited[], int current, boolean recStack[]) {
        visited[current] = true;
        recStack[current] = true;

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            
            // If the neighbor is already in the recursion stack, a cycle exists
            if (recStack[e.destination]) {
                return true;
            } 
            // If the neighbor is unvisited, recurse on it
            else if (!visited[e.destination]) {
                if (isCyclicDirected(graph, visited, e.destination, recStack)) {
                    return true;
                }
            }
        }

        recStack[current] = false; // Backtrack
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5; // Fixed size to accommodate node index 4
        
        ArrayList<Edge> graph[] = new ArrayList[V]; // Fixed array initialization
        createGraph(graph);

        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];

        boolean hasCycle = false;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclicDirected(graph, visited, i, recStack)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        System.out.println("Graph contains cycle: " + hasCycle);
    }
}
