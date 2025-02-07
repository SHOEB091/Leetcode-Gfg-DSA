package stack;

import java.util.Stack;

class queueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public queueUsingStack() {
        // Constructor
    }

    // Function to push an element onto the queue
    public void push(int x) {
        s1.push(x);
    }

    // Function to pop an element from the queue and return that element
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // Function to get the front element of the queue
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Function to check if the queue is empty
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        queueUsingStack queue = new queueUsingStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.peek()); // Should print 1
        System.out.println(queue.pop());  // Should print 1
        System.out.println(queue.peek()); // Should print 2
        System.out.println(queue.pop());  // Should print 2
        System.out.println(queue.empty()); // Should print false
        System.out.println(queue.pop());  // Should print 3
        System.out.println(queue.empty()); // Should print true
    }
}