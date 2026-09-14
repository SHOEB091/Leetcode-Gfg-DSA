package Heaps;

public class TopKFrequentNumbers{

  public static class Pair implements Comparable{
    int key;
    int value;
    public pair(int key , int value){
      this.key= key;
      this.value = value;
    }
    @Override
    public int compareTo(Pair other) {
        // "other.key - this.key" creates a MAX-HEAP based on the key (distance).
        // The pair with the larger distance goes to the top of the heap.
        return other.key - this.key; 
    }
  }
  
  public static int[] frequentNumber(int[] arr , int k){
    HashMap<Integer,Integer> map = new HashMap<>();
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    for(int num: arr){
      map.put(num,map.getOrDefault(num,0)+1);
    }
   // Max-heap or min-heap storing custom Pair objects
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int key = entry.getKey();
      int freq = entry.getValue();
    
      // Add pair: (frequency, key)
      minHeap.add(new Pair(freq, key));
    }
  }
}
