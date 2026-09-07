package Graphs;
import java.util.ArrayList;

public class UndirectedCycleGraphDetection {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
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
        graph[4].add(new Edge(4, 3));
    }

    public static boolean undirectedCycle(ArrayList<Edge> graph[], boolean visited[], int current, int parent) {
        visited[current] = true;

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);

            // Condition 1: Neighbor is visited and NOT the immediate parent -> Cycle detected!
            if (visited[e.dest] && parent != e.dest) {
                return true;
            }

            // Condition 2: Neighbor is visited AND is the parent -> Do nothing (continue loop)

            // Condition 3: Neighbor is not visited -> Recurse on it
            if (!visited[e.dest]) {
                if (undirectedCycle(graph, visited, e.dest, current)) {
                    return true;
                }
            }
        }
        return false;
    }

    // O(V+E) - Wrapper method to handle disconnected graph components
    public static boolean isCyclic(ArrayList<Edge>[] graph, boolean vis[]) {
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (undirectedCycle(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V];
        
        System.out.println("Graph contains cycle: " + isCyclic(graph, vis));
    }
}
