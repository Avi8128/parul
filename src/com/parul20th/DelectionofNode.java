package com.parul20th;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DelectionofNode {

    // Function to detect the first node of the loop
    public static Node detectCycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect if there is a loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No loop found
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find start node of the loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // First node in the loop
    }

    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(1);
        head.next = new Node(2);
        Node loopStart = new Node(3);
        head.next.next = loopStart;
        loopStart.next = new Node(4);
        loopStart.next.next = new Node(5);
        loopStart.next.next.next = loopStart;  // Creates the loop

        // Detect loop start
        Node startNode = detectCycleStart(head);
        if (startNode != null) {
            System.out.println("Cycle detected. Loop starts at node with data: " + startNode.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
