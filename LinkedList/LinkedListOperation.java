package LinkedList;

class LinkedListOperation<T> {
    Node<T> head;

    void insertAtEnd(Node<T> node) {
        if (head == null) {
            head = node;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void insertAtStart(Node<T> node) {
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListOperation<Integer> list = new LinkedListOperation<>();

        // Insert at start
        list.insertAtStart(new Node<>(1));
        list.insertAtStart(new Node<>(2));
        list.insertAtStart(new Node<>(3));

        // Insert at end
        list.insertAtEnd(new Node<>(4));
        list.insertAtEnd(new Node<>(5));

        // Print the linked list
        list.printList();
    }
}