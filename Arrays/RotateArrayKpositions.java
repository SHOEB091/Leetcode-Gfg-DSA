package Arrays;

public class RotateArrayKpositions {

    /*   OPTIMAL APPROACH
      public static void rotateArray(int[] arr, int rotatedBy) {
        int n = arr.length;
        rotatedBy = rotatedBy % n; // Normalize rotatedBy to ensure it is within the bounds of the array length
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse the first part
        reverse(arr, 0, rotatedBy - 1);
        // Reverse the second part
        reverse(arr, rotatedBy, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
     */

     // This is to Left rotate array
     /*
      * reverse(arr, 0, n - 1);
      *reverse(arr, 0, n - d - 1);
      *reverse(arr, n - d, n - 1);
     */



    public static int[] rotateArray(int[] arr, int rotatedBy) {
        int n = arr.length;
        int[] nums = new int[n];

        // Normalize rotatedBy to ensure it is within the bounds of the array length
        //rotatedBy = rotatedBy % n;

        int tempIndex = 0;

        // Store the rotated elements from rotatedBy to the end of the array
        for (int i = n - rotatedBy; i < n; i++) {
            nums[tempIndex] = arr[i];
            tempIndex++;
        }

        // Store the remaining elements from the start of the array to rotatedBy
        for (int i = 0; i < n - rotatedBy; i++) {
            nums[tempIndex] = arr[i];
            tempIndex++;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotatedBy = 3;
        int[] result = rotateArray(arr, rotatedBy);
        System.out.println("Rotated array: " + java.util.Arrays.toString(result)); // Should print [5, 6, 7, 1, 2, 3, 4]
    }
}