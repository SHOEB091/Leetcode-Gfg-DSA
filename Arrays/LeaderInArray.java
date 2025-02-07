package Arrays;
import java.util.*;
public class LeaderInArray {
    
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int[] arr, int n) {
        int leader = 0;

        //Storing Leader in ArrayList 
        ArrayList<Integer> leaders = new ArrayList<Integer>();

        //Reverse Loop 
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= leader) {
                leader = arr[i];
                leaders.add(leader);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 15, 8};
        ArrayList<Integer> result = leaders(arr, arr.length);
        System.out.println("Leaders in the array: " + result);
    }
}
