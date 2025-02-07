package Arrays;
import java.util.*;


public class SingleNumber {
    
    public static int singleNumber(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == number) {
                    count++;
                }
            }
            if (count == 1) {
                return number;
            }
        }
        // If no single element is found, return -1 or any other appropriate value
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 4, 1, 3, 2};
        System.out.println(singleNumber(arr1)); // Output: 1

        int[] arr2 = {2, 2, 1};
        System.out.println(singleNumber(arr2)); // Output: 1

        int[] arr3 = {1};
        System.out.println(singleNumber(arr3)); // Output: 1

        int[] arr4 = {1, 1, 2, 2};
        System.out.println(singleNumber(arr4)); // Output: -1 (no single element)

        int[] arr5 = {4, 3, 2, 4, 1, 3, 2};
        System.out.println(singleNumber2(arr1)); // Output: 1

        int[] arr6 = {2, 2, 1};
        System.out.println(singleNumber2(arr2)); // Output: 1

        int[] arr7 = {1};
        System.out.println(singleNumber2(arr3)); // Output: 1

        int[] arr8 = {1, 1, 2, 2};
        System.out.println(singleNumber2(arr4)); // Output: -1 (no single element)
    }


    public static int singleNumber2(int[]arr){
        int n = arr.length;

        // Count the occurrences of each number in the array
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int nums : arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        for(int num:arr){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }


}
