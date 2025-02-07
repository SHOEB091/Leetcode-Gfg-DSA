package LinkedList;



public class SeperateEvenOddNode {

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    static void printList(Node newHead){
        Node temp = newHead;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static Node segregateEvenOdd(){
        Node oddHead = new Node(-1);
        Node oddTail = oddHead;
        Node evenHead = new Node(-1);
        Node evenTail = evenHead;
        Node curr = head;

        while (curr != null) {
            Node temp = curr;
            curr = curr.next;
            temp.next = null;

            if (temp.data % 2 != 0) { // If odd Node, append to odd LinkedList
                oddTail.next = temp;
                oddTail = temp;
            } else { // If Even Node, append to even LinkedList
                evenTail.next = temp;
                evenTail = temp;
            }
        }
        evenTail.next = oddHead.next; 
        // Appending Odd LinkedList at end of EvenLinkedList
        return evenHead.next;
    }

    public static void main(String args[]) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        System.out.println("Initial LinkedList: ");
        printList(head);
        Node newHead = segregateEvenOdd();
        System.out.println("LinkedList After Segregation: ");
        printList(newHead);
    }
}