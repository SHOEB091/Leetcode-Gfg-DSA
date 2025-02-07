package LinkedList;

import java.util.Scanner;

// Use of Linkedlist is 
// it is used in stack and queue to implement it 
// Image gallery ... it is a doubley linked list 
// Music Player 
// Browser 
// Hash Map and Hash Set 

// Representation of Singly Linked List 
// class Node<T> unknown data type used 

class Node<T> {
    T data;
    Node<T> next; // Node type reference variable called next 

    // Creating constructor 
    public Node(T data) {
        this.data = data; // Using 'this' keyword to refer to the current object's data member
        this.next = null;
    }
}

class LinkedListOperations<T> {
    Node<T> head;

    void insertAtEnd(Node<T> node) {
        if (head == null) {
            head = node;
        } else {
            Node<T> temp = head; // Dummy pointer pointing reference variable
            while (temp.next != null) { // Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void print() {
        Node<T> temp = head;
        while (temp != null) { // Traverse and print each node's data
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class Customer {
    int id;
    String name;
    double balance;
}

public class SinglyLinkedList {

    public static void main(String[] args) {
        LinkedListOperations<Integer> list = new LinkedListOperations<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insertion at End");
            System.out.println("2. Printing");
            System.out.println("0 to exit");
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thanks for using...");
                    return;
                case 1:
                    System.out.println("Enter the data of new Node ");
                    int data = sc.nextInt();
                    Node<Integer> node = new Node<>(data);
                    list.insertAtEnd(node); // Pass the node to insertAtEnd
                    break;
                case 2:
                    list.print();
                    break;
            }
        }
    }
}