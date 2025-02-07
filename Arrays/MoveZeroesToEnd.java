package Arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    
    public static void moveZeroes(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int n = arr.length;
        int j = -1;

        // Finding First Zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
            
        // If there are no zeros then we return it 
        if (j == -1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        // Moving non-zero elements to the left of the first zero  
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        moveZeroes(arr1); // Output: [1, 3, 12, 0, 0]

        int[] arr2 = {1, 2, 3, 4, 5};
        moveZeroes(arr2); // Output: [1, 2, 3, 4, 5]

        int[] arr3 = {0, 0, 1};
        moveZeroes(arr3); // Output: [1, 0, 0]

        int[] arr4 = {0};
        moveZeroes(arr4); // Output: [0]
    }
}