package stack;
import java.util.Stack;

public class NextGreaterElement {
    // Method to find the next greater elements for each element in the array
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        // Iterate through the array from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            // Pop elements from the stack that are less than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            // If the stack is empty, there is no greater element, so set result[i] to -1
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                // Otherwise, the next greater element is the top element of the stack
                result[i] = stack.peek();
            }
            // Push the current element onto the stack
            stack.push(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement nge = new NextGreaterElement();
        int[] nums = {4, 5, 2, 25};
        int[] result = nge.nextGreaterElements(nums);
        System.out.println("Next greater elements: " + java.util.Arrays.toString(result)); // Should print [5, 25, 25, -1]

        nums = new int[]{13, 7, 6, 12};
        result = nge.nextGreaterElements(nums);
        System.out.println("Next greater elements: " + java.util.Arrays.toString(result)); // Should print [-1, 12, 12, -1]
    }
}





/*Handeling circular iteration on arrays 
 * import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate through the array twice to handle the circular nature
        for (int i = 2 * n - 1; i >= 0; i--) {
            // Pop elements from the stack that are less than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            // If we are in the first pass, set the result
            if (i < n) {
                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
            }
            // Push the current element onto the stack
            stack.push(nums[i % n]);
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement nge = new NextGreaterElement();
        int[] nums = {1, 2, 1};
        int[] result = nge.nextGreaterElements(nums);
        System.out.println("Next greater elements: " + java.util.Arrays.toString(result)); // Should print [2, -1, 2]

        nums = new int[]{4, 5, 2, 25};
        result = nge.nextGreaterElements(nums);
        System.out.println("Next greater elements: " + java.util.Arrays.toString(result)); // Should print [5, 25, 25, -1]

        nums = new int[]{13, 7, 6, 12};
        result = nge.nextGreaterElements(nums);
        System.out.println("Next greater elements: " + java.util.Arrays.toString(result)); // Should print [-1, 12, 12, -1]
    }
}
 */