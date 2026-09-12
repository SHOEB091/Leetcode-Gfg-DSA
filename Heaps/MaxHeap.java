package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;
public class MaxHeap {
    public static int kthSmallest(int []arr, int k ){
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++){
            maxheap.add(arr[i]);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        return maxheap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = kthSmallest(arr, k);
        System.out.println("The " + k + "rd smallest element is: " + result);
    }
}
