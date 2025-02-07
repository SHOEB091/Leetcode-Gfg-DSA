package BinarySearch;

public class FindMaximumInBitonicArray {
    // Bitonic means monotonically increasing then decreasing
    // There is only one peak element in a Bitonic array
    public static int maximumInBitonicArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                } else if (arr[mid - 1] > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return arr[0];
                } else {
                    return arr[1];
                }
            } else if (mid == arr.length - 1) {
                if (arr[arr.length - 1] > arr[arr.length - 2]) {
                    return arr[arr.length - 1];
                } else {
                    return arr[arr.length - 2];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int maxElement = maximumInBitonicArray(arr);
        System.out.println("Maximum element in bitonic array: " + maxElement);
    }
}