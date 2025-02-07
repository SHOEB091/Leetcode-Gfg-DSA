package Arrays;
import java.util.*;
public class UniqueElements {
//approach 2
    public static boolean uniqueEle(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        //count number of occurence of each element
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }

        // Print the unique elements
        System.out.println("Unique elements:");
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
            }
        }

        //Set to check if occurences are unique

        HashSet<Integer>occurences = new HashSet<>();

        for(int frequency : map.values()){
            if(!occurences.add(frequency)){ //if frequency is already present in the set,
                return false;
            }
        }
        return true;

    }

    /*
    public static boolean uniqueEle(int[] arr){
        for(int i=0;i<arr.length;i++){

            boolean isUnique =true;

            for(int j=0;j<arr.length;j++){

                if(i!=j && arr[i]==arr[j]){
                    isUnique=false;
                    break;
                }
            }
        }
        return true;
    }
        */

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3};

        System.out.println(uniqueEle(arr1));
    }
}
