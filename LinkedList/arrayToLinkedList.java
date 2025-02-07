package LinkedList;

public class arrayToLinkedList {

    // Node class representing each element in the linked list
    static class Node {
        int data; // Data stored in the node
        Node next; // Pointer to the next node in the list

        // Constructor to initialize the node with a value
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    // Method to construct a linked list from an array
    public Node constructLL(int arr[]) {
        if (arr.length == 0) {
            return null; // Return null if the array is empty
        }

        head = new Node(arr[0]); // Create the head node
        Node current = head; // Pointer to construct the list

        // Loop through the array and create nodes
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head; // Return the head of the constructed list
    }

    // Method to traverse and print the linked list
    public void traverse(Node head) {
        if (head == null) {
            System.out.println("List is empty."); // Print if the list is empty
            return;
        }
        Node p = head; // Pointer to traverse the list
        while (p != null) {
            System.out.print(p.data + " "); // Print the data of each node
            p = p.next; // Move to the next node
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example array to convert to linked list
        int[] arr = {1, 2, 3, 4, 5};

        // Create an instance of arrayToLinkedList
        arrayToLinkedList list = new arrayToLinkedList();

        // Construct the linked list from the array
        Node head = list.constructLL(arr);

        // Traverse and print the linked list
        System.out.print("Linked List: ");
        list.traverse(head);
    }
}