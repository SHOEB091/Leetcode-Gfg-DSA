package Arrays;

public class MissingAndRepeatingNumber {
    // Given an array of Integers
    // arr = [4, 3, 6, 2, 1, 1], n = 6
    // 1 is repeating and 5 is the missing number
    public static int[] BruteForce(int[] arr) {
        int n = arr.length;
        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                repeating = i;
            } else if (count == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        return new int[]{repeating, missing};
    }

    //BETTER APPROACH 
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length; // size of the array
        int[] hash = new int[n + 1]; // hash array

        //update the hash array:
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        //Find the repeating and missing number:
        int repeating = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) repeating = i;
            else if (hash[i] == 0) missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = {repeating, missing};
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int[] result = BruteForce(arr);
        System.out.println("Repeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}