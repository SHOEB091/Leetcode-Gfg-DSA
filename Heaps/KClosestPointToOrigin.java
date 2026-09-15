package Heaps;

public class KClosestPointToOrigin{
  public static class Pair implements Comparable<Pair>{
    int key;
    int value;
    public Pair(int key , int value){
      this.key = key;
      this.value = value;
    }
    @Override
    public int compareTo(int order){
      return this.order - this.key;
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
