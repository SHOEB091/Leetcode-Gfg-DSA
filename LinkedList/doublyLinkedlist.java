package LinkedList;

public class doublyLinkedlist {
    
    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node (int data){
            this.data = data;
            this .prev=null;
            this.next = null;
        }
    }

    //add First in a Doubly linked list 
    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev= newNode;
        head = newNode;
    }

    //add Last in Doubly Linked List 
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail = newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail = newNode;
    }

    //remove first 
    public static int removeFirst(){
        if(head==null){
            System.out.println("Dll is Empty ");
            return -1;
        }
    
        int val = head.data;
        head= head.next;
        head.prev=null;
        size--;
        return val;

    }

    //remove last
    public static int removeLast() {
        if (head == null) {
            System.out.println("Dll is Empty");
            return -1;
        }
        if (head.next == null) { // Only one node in the list
            int val = head.data;
            head = null;
            tail = null;
            size--;
            return val;
        }
        Node prev = head;
        while (prev.next.next != null) { // Traverse to the second last node
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //method to print the doubly linked list 
    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " <-> ");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublyLinkedlist dll = new doublyLinkedlist();

        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addFirst(40);
        dll.addFirst(50);

        dll.print();


        dll.addLast(10);
        dll.print();

       /*  dll.removeFirst();
        dll.print();

        dll.removeLast();
        dll.print();
        */
    }
}
