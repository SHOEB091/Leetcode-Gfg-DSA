package Arrays;

public class PrintSubArrays {
    // In an array of size N, there are N*(N+1)/2 subarrays

    public static void ContinousPair(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) { // Corrected the increment variable to j
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " "); // SubArray
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        ContinousPair(arr);
    }
}















