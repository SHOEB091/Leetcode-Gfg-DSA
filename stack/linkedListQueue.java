package stack;

public class linkedListQueue {

    // Node class for queue elements
    class QueueNode {
        int data;
        QueueNode next;
        QueueNode(int a) {
            data = a;
            next = null;
        }
    }

    public QueueNode front = null;
    public QueueNode rear = null;

    public boolean isEmpty() {
        return front == null;
    }

    // Function to push an element into the queue.
    void push(int a) {
        QueueNode newNode = new QueueNode(a);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Function to pop front element from the queue.
    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int frontData = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return frontData;
    }

    // Function to print all elements in the queue.
    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedListQueue queue = new linkedListQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Queue elements:");
        queue.print(); // Should print 1 2 3

        System.out.println("Popped element: " + queue.pop()); // Should print 1
        System.out.println("Queue elements after pop:");
        queue.print(); // Should print 2 3

        System.out.println("Popped element: " + queue.pop()); // Should print 2
        System.out.println("Queue elements after pop:");
        queue.print(); // Should print 3

        System.out.println("Popped element: " + queue.pop()); // Should print 3
        System.out.println("Queue elements after pop:");
        queue.print(); // Should print "Queue is empty"
    }
}