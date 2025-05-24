package com.parul21st;

public class DoublyLinkedList {

    static TwoNode head = null; // head of the list

    public static void main(String[] args) {
        // Create and link nodes
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);

        System.out.println("Original List:");
        displayList();

        // Deletion from the beginning
        deleteFromBeginning();
        System.out.println("\nAfter deletion from beginning:");
        displayList();

        // Deletion from the end
        deleteFromEnd();
        System.out.println("\nAfter deletion from end:");
        displayList();
    }

    // Insert a new node at the end
    public static void insertAtEnd(int data) {
        TwoNode newNode = new TwoNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        TwoNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete node from beginning
    public static void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete node from end
    public static void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        TwoNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Display the list
    public static void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TwoNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
        
        
        
    }
}

// Node class
class TwoNode {
    int data;
    TwoNode prev;
    TwoNode next;

    public TwoNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
