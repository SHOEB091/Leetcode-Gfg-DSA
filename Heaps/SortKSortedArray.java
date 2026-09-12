package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortKSortedArray {
    public static ArrayList sortedArray(int[]arr , int k){
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                int ele = minHeap.poll();
                list.add(ele);
            }
        }
        while(!minHeap.isEmpty()){
            int ele= minHeap.poll();
            list.add(ele);
        }
        return list;

    }
    public static void main(String[] args) {
        int arr[] = {6,5,3,2,8,10,9};
        int k = 3;
        System.out.println(sortedArray(arr, k));
    }
}
