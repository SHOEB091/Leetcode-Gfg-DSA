package stack;

public class linkedListStack {
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    static Node head = null;

    public static boolean isEmpty(){
        return head == null;
    }

    //push operation 
    public static void push(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    //pop operation
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;

    }

    // Function to print all elements in the stack.
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        linkedListStack stack = new linkedListStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack elements:");
        stack.print(); // Should print 3 2 1

        System.out.println("Popped element: " + stack.pop()); // Should print 3
        System.out.println("Stack elements after pop:");
        stack.print(); // Should print 2 1

        System.out.println("Popped element: " + stack.pop()); // Should print 2
        System.out.println("Stack elements after pop:");
        stack.print(); // Should print 1

        System.out.println("Popped element: " + linkedListStack.pop()); // Should print 1
        System.out.println("Stack elements after pop:");
        stack.print(); // Should print "Stack is empty"

    }

}
