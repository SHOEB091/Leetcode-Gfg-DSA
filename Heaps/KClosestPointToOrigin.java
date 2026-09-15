package Heaps;

public class KClosestPointToOrigin{
 static class Pair implements Comparable<Pair> {
    int dist;   // x*x + y*y  (the heap key)
    int x, y;   // the point itself

    public Pair(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    // Max-Heap: largest dist stays at the top
    @Override
    public int compareTo(Pair other) {
        return Integer.compare(other.dist, this.dist);
    }
}
  
  public int[][] kClosest(int[][] arr, int k) {
    PriorityQueue<Pair> maxHeap = new PriorityQueue<>();

    for (int i = 0; i < arr.length; i++) {
        int d = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];
        maxHeap.add(new Pair(d, arr[i][0], arr[i][1]));
        if (maxHeap.size() > k) maxHeap.poll();   // drop the farthest
    }

    int[][] res = new int[maxHeap.size()][2];
    int idx = 0;
    while (!maxHeap.isEmpty()) {
        Pair p = maxHeap.poll();
        res[idx][0] = p.x;
        res[idx][1] = p.y;
        idx++;
    }
    return res;
}
}
