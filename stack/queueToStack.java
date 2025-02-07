package stack;

import java.util.LinkedList;
import java.util.Queue;

public class queueToStack {
    
    Queue<Integer> q = new LinkedList<>();

    public queueToStack() {
        // Constructor
    }

    // Function to push an element onto the stack
    public void push(int x) {
        q.add(x); // Add the element to the queue
        int s = q.size();
        // Rotate the queue to make the last added element the front of the queue
        for (int i = 1; i < s; i++) {
            q.add(q.remove());
        }
    }

    // Function to pop the top element from the stack
    public int pop() {
        return q.remove(); // Remove and return the front element of the queue
    }

    // Function to get the top element of the stack
    public int top() {
        return q.peek(); // Return the front element of the queue
    }

    // Function to check if the stack is empty
    public boolean empty() {
        return q.isEmpty(); // Return true if the queue is empty, false otherwise
    }

    public static void main(String[] args) {
        queueToStack stack = new queueToStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top()); // Should print 3
        System.out.println(stack.pop()); // Should print 3
        System.out.println(stack.top()); // Should print 2
        System.out.println(stack.pop()); // Should print 2
        System.out.println(stack.empty()); // Should print false
        System.out.println(stack.pop()); // Should print 1
        System.out.println(stack.empty()); // Should print true
    }

}
