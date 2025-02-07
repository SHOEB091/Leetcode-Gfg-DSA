package BinarySearch;

public class BinarySearchIntwoDarray {

    public static int[] search(int[][] arr, int key) {
        int m = arr.length;
        int n = arr[0].length;
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == key) {
                return new int[]{row, col};
            } else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 29;
        int[] result = search(arr, key);
        if (result[0] != -1) {
            System.out.println("Element found at index: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Element not found");
        }
    }
}