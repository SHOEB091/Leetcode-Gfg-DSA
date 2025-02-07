package Arrays;

public class checkRotatedSorted {
    
    public boolean check(int[] arr) {
        int count = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        checkRotatedSorted checker = new checkRotatedSorted();
        
        int[] arr1 = {3, 4, 5, 1, 2};
        System.out.println(checker.check(arr1)); // Should print true

        int[] arr2 = {2, 1, 3, 4};
        System.out.println(checker.check(arr2)); // Should print false

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(checker.check(arr3)); // Should print true

        int[] arr4 = {1, 3, 2};
        System.out.println(checker.check(arr4)); // Should print false
    }
}