package Arrays;
//Target Sum 

public class TwoPointers {
    
    static int[] targetSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
                
            }
            else{
                j--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 9;
        int[] result = targetSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
