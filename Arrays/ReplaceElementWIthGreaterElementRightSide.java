package Arrays;

public class ReplaceElementWIthGreaterElementRightSide {
    public int[] replaceElements(int[] arr) {
        int max = -1; // Initialize max to -1 since the last element's replacement is -1
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i]; // Store the current element
            arr[i] = max;         // Replace the current element with max
            if (current > max) {  // Update max if the current element is greater
                max = current;
            }
        }
        return arr;
    }
}
