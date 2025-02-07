package Hashing;

import java.util.HashMap;

// Hashing is a process of mapping data to a fixed-size value using a hash function. It is widely used in data structures like hash tables, hash maps, and sets to provide quick access to elements.

// Implements by using hashmap and hashset in java

public class countNumberofOccurence {

    public static HashMap<Integer,Integer> countFrequencies(int[]arr){

        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num : arr){

            //another method can be used 
            // frequencyMap.put(nums, frequencyMap.getOrDefault(nums,o)+1);

            if(frequencyMap.containsKey(num)){
                frequencyMap.put(num,frequencyMap.get(num)+1);
            }
            else{
                frequencyMap.put(num,1);
            }
        }
        return frequencyMap;

    }

    public static void main(String[] args) {
        int[]arr ={1,2,2,3,3,3,4,4,4,4,};

        HashMap<Integer,Integer> frequencies = countFrequencies(arr);

        System.out.println("Element Frequencies: ");

        for(int key : frequencies.keySet()){
            System.out.println(key + "->" + frequencies.get(key));
        }

    }


    /*public static int countOccurence(int number , int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                count=count+1;
            }
        }
        return count;
    }*/


}
