package BinarySearch;

public class allocatePageOfBooks {

    static int allocatepage(int[] arr, int n, int m) {
        // n = number of books
        // m = number of persons to whom books are to be allocated  
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSum = maxSum + arr[i];
        }
        int start = 0;
        int end = maxSum;
        int result = -1;
        if (n < m) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, n, m, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    static boolean isValid(int[] arr, int n, int m, int mid) {
        int student = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum > mid) {
                student++;
                sum = arr[i];
            }
            if (student > m) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int n = arr.length;
        int m = 2; // Number of students
        System.out.println("Minimum number of pages = " + allocatepage(arr, n, m));
    }
}