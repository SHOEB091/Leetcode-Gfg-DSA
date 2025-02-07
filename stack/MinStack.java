package stack;
import java.util.*;
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Function to push an element onto the stack.
    public void push(int x) {
        if (x <= min) {
            minStack.push(min);
            min = x;
        }
        stack.push(x);
    }

    // Function to pop the top element from the stack.
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        if (stack.pop() == min) {
            min = minStack.pop();
        }
    }

    // Function to get the top element of the stack.
    public int top() {
        return stack.peek();
    }

    // Function to retrieve the minimum element in the stack.
    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);

        System.out.println("Minimum element: " + minStack.getMin()); // Should print 0
        minStack.pop();
        System.out.println("Minimum element: " + minStack.getMin()); // Should print 0
        minStack.pop();
        System.out.println("Minimum element: " + minStack.getMin()); // Should print 0
        minStack.pop();
        System.out.println("Minimum element: " + minStack.getMin()); // Should print 2
    }
}

