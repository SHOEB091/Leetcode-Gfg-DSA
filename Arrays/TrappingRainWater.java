package Arrays;

public class TrappingRainWater {
    // height = [4, 2, 0, 3, 2, 5]
    // width of building = 1

    // Function to get the maximum height to the left of each building
    public static int[] getLeftMax(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0]; // The first building has no left building, so leftMax is the height of the first building

        // Iterate through the array to fill leftMax array
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]); // The maximum height to the left of the current building
        }
        return leftMax;
    }

    // Function to get the maximum height to the right of each building
    public static int[] getRightMax(int[] height) {
        int n = height.length;
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1]; // The last building has no right building, so rightMax is the height of the last building

        // Iterate through the array in reverse to fill rightMax array
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]); // The maximum height to the right of the current building
        }
        return rightMax;
    }

    // Function to calculate the total amount of trapped rainwater
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0 || n == 1) {
            return 0; // If there are no buildings or only one building, no water can be trapped
        }

        int[] leftMax = getLeftMax(height); // Get the maximum height to the left of each building
        int[] rightMax = getRightMax(height); // Get the maximum height to the right of each building

        int sum = 0; // Variable to store the total amount of trapped rainwater

        // Iterate through each building to calculate the trapped water
        for (int i = 0; i < n; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i]; // The trapped water above the current building
        }
        return sum; // Return the total amount of trapped rainwater
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println("Total trapped rainwater: " + solution.trap(height)); // Output: 9
    }
}