package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithXorK {
    //Brute force appraoch 
    public static int CountXorSubArray(int[] arr, int E) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                xor = xor ^ arr[j];
                if (xor == E) {
                    count++;
                }
            }
        }

        return count;
    }
     //Optimal approach
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ a[i];

            //By formula: x = xr^k:
            int x = xr ^ k;

            // add the occurrence of xr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 2, 6, 4};
        int E1 = 6;
        System.out.println(CountXorSubArray(arr1, E1)); // Output: 4

        int[] arr2 = {5, 6, 7, 8, 9};
        int E2 = 5;
        System.out.println(CountXorSubArray(arr2, E2)); // Output: 2
    }
}