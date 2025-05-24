package com.parul20th;



public class MiddleElement {

    // Function to find the middle node of a linked list
    public static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        // Move slow by 1 and fast by 2
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow will be at the middle
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find and print middle node
        Node middle = findMiddle(head);
        if (middle != null) {
            System.out.println("Middle element is: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
