package LinkedList;


class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class sortZerosAndOnce {
    public static Node head;
    public static Node tail;

// Function to sort a linked list of 0s, 1s, and 2s.
static Node segregate(Node head) {
    // If the list is empty or has only one node, return the head
    if (head == null || head.next == null) {
        return head;
    }

    // Create dummy nodes for 0s, 1s, and 2s lists
    Node zeroHead = new Node(-1), zero = zeroHead;
    Node oneHead = new Node(-1), one = oneHead;
    Node twoHead = new Node(-1), two = twoHead;

    // Traverse the original list and distribute nodes into 0s, 1s, and 2s lists
    Node temp = head;
    while (temp != null) {
        if (temp.data == 0) {
            zero.next = temp;
            zero = temp;
        } else if (temp.data == 1) {
            one.next = temp;
            one = temp;
        } else {
            two.next = temp;
            two = temp;
        }
        temp = temp.next;
    }

    // Connect the three lists
    zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
    one.next = twoHead.next;
    two.next = null; // End the list

    // The new head is the start of the 0s list
    Node newHead = zeroHead.next;

    return newHead;
}

// Helper method to print the linked list
public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}

// Helper method to add a node at the end of the linked list
public static void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
}

public static void main(String[] args) {
    sortZerosAndOnce solution = new sortZerosAndOnce();
    solution.addLast(1);
    solution.addLast(2);
    solution.addLast(0);
    solution.addLast(1);
    solution.addLast(2);
    solution.addLast(0);

    System.out.println("Original LinkedList: ");
    solution.printList(head);

    Node newHead = solution.segregate(head);
    System.out.println("LinkedList After Segregation: ");
    solution.printList(newHead);
}
}