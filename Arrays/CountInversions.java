package Arrays;

public class CountInversions {
    
    // Brute Force Approach 
    public static int inversionCount(int arr[]) {
        // condition: i < j and arr[i] > arr[j]
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 3, 5};
        System.out.println("Inversion count: " + inversionCount(arr1)); // Output: 3

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println("Inversion count: " + inversionCount(arr2)); // Output: 10

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Inversion count: " + inversionCount(arr3)); // Output: 0
    }
}