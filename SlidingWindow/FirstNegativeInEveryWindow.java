package SlidingWindow;
import java.util.*;

public class FirstNegativeInEveryWindow {
    
    static List<Integer> everyNegative(int[] arr, int k) {
        List<Integer> list = new ArrayList<>(); // To store negative numbers in the current window
        List<Integer> result = new ArrayList<>(); // To store the first negative number of each window
        int i = 0;
        int j = 0;
        
        while (j < arr.length) {
            // If current element is negative, add it to the list
            if (arr[j] < 0) {
                list.add(arr[j]);
            }
            
            // If the window size is less than k, just move the window to the right
            if (j - i + 1 < k) {
                j++;
            }
            // Once we have a window of size k
            else if (j - i + 1 == k) {
                // If there are no negative numbers in the current window
                if (list.isEmpty()) {
                    result.add(0);
                } else {
                    // The first element in the list is the first negative number in the window
                    result.add(list.get(0));
                    // If the element going out of the window is negative, remove it from the list
                    if (arr[i] == list.get(0)) {
                        list.remove(0);
                    }
                }
                // Slide the window forward
                i++;
                j++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> result = everyNegative(arr, k);
        System.out.println("First negative number in every window of size " + k + ": " + result);
    }
}