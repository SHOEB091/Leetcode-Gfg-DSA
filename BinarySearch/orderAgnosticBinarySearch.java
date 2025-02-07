package BinarySearch;


public class orderAgnosticBinarySearch {

    public static int AgnosticBinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        // Determine if the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];
        boolean isDescending = arr[start] > arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (isAscending) {
                if (key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } if(isDescending) {
                if (key > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] ascendingArr = {1, 3, 5, 7, 9, 11};
        int[] descendingArr = {11, 9, 7, 5, 3, 1};

        int key = 7;

        int resultAsc = AgnosticBinarySearch(ascendingArr, key);
        System.out.println("Element found at index (ascending array): " + resultAsc);

        int resultDesc = AgnosticBinarySearch(descendingArr, key);
        System.out.println("Element found at index (descending array): " + resultDesc);
    }
}

