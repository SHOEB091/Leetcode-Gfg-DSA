package stack;

public class trappingRainWater {

    public static int trappingWater(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int n = arr.length;
        int total = 0;

        // Arrays to store the maximum height to the left and right of each element
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate the total water trapped
        for (int i = 0; i < n; i++) {
            total += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] elevationMap = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trappingWater(elevationMap);
        System.out.println("Total water trapped: " + result); // Should print 6
    }
}