Public class BellmanFordAlgo{
  public static class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int src, int dest,int wt){
      this.src = src;
      this.dest = dest;
      this.wt = wt;
    }
  }
  public static void createGraph(ArrayList<Edge> graph[]){
    for(int i =0;i<graph.length;i++){
      graph[i] = new ArrayList<Edge>();
    }
    graph[0].add(new Edge(0, 1, 2));
    graph[0].add(new Edge(0, 2, 4));
    graph[1].add(new Edge(1, 2, -4));
    graph[2].add(new Edge(2, 3, 2));
    graph[3].add(new Edge(3, 4, 4));
    graph[4].add(new Edge(4, 1, -1));
  }

  public static int[] bellmanFord(Arraylist<Edge> graph[] , int src){
    int dist [] = new int[graph.length];
    for(int i=0;i<dist.length;i++){
      if(i != src){
        dist[i] = Integer.MAX_VALUE;
      }
    }
    //O(V)
    for(int k =0;k<V-1;k++){   // v-1 times loop runs
      // O(E)
      for(int i = 0; i<V;i++{   // edges nikalne ke liye
        for(int j= 0;j<graph[i].size();j++){
          Edge e = graph[i].get(j);
          int u = e.src;
          int v = e.dest;

          if(dist[u] !=Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
            dist[v] dist[u] + e.wt;
          }
        }
    }
  }
  //Printing elements
    for(int i =0; i<dist.lenght;i++){
      System.out.println(dist);
    }
    System.out.println();
  
}
