package LinkedList;


class arrayToLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;
    
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Function to construct a doubly linked list from an array
    Node constructDLL(int arr[]) {
        if (arr.length == 0) {
            return null; // Return null if the array is empty
        }

        Node head = new Node(arr[0]); // Create the head node
        Node current = head; // Pointer to construct the list

        // Loop through the array and create nodes
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode; // Link the new node to the current node
            newNode.prev = current; // Link the current node to the new node
            current = newNode; // Move to the new node
        }

        return head; // Return the head of the constructed list
    }

    // Helper method to print the doubly linked list
    static void printList(Node head) {
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
        arrayToLinkedList solution = new arrayToLinkedList();

        // Example array to convert to doubly linked list
        int[] arr = {1, 2, 3, 4, 5};

        // Construct the doubly linked list from the array
        Node head = solution.constructDLL(arr);

        // Print the doubly linked list
        System.out.print("Doubly Linked List: ");
        printList(head);
    }
}