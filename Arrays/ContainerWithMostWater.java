package Arrays;

public class ContainerWithMostWater {
    
    // Function to find the maximum area of water that can be contained
    public int maxArea(int[] height) {
        int n = height.length; // Length of the height array
        int i = 0, j = n - 1; // Two pointers, one at the beginning and one at the end of the array
        int maxWater = 0; // Variable to store the maximum water area

        // Loop until the two pointers meet
        while (i < j) {
            int w = j - i; // Width of the container

            int h = Math.min(height[i], height[j]); // Height of the container is the minimum of the two heights

            int area = w * h; // Calculate the area of the container

            maxWater = Math.max(maxWater, area); // Update the maximum water area if the current area is greater

            // Move the pointer pointing to the shorter line towards the center
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxWater; // Return the maximum water area
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water area: " + solution.maxArea(height)); // Output: 49
    }
}