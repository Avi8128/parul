package com.parul19th;

//class SingleNode {
//    int data;
//    SingleNode next;
//
//    // Constructor
//    public SingleNode(int data) {
//        this.data = data;
//        this.next = null;
//    }
//
//    // Optional: Print the node
//    public void displayNode() {
//        System.out.println("Node Data: " + data);
//    }
//}

public class SingleNodeDemo {

    private SingleNodeDemo node;  // reference to next node
    private int data;             // node data

    // Constructor accepting int data
    public SingleNodeDemo(int data) {
        this.data = data;
        this.node = null;
    }

    public static void main(String[] args) {
        SingleNodeDemo singleNodeDemo1 = new SingleNodeDemo(10);
        SingleNodeDemo singleNodeDemo2 = new SingleNodeDemo(20);

        // Link first node to second node
        singleNodeDemo1.node = singleNodeDemo2;

        System.out.println("First Node data :: " + singleNodeDemo1.data);
        System.out.println("Second Node data :: " + singleNodeDemo1.node.data);
        System.out.println("Second Node ref >>> " + singleNodeDemo1.node.node);
        // This will print null since second node's next is null
    }


//
//        // Display the node
//        singleNode.displayNode();
    	
//    	
//
//    	class SingleNode {
//    	    int data;
//    	    SingleNode next;
//
//    	    // Constructor
//    	    public SingleNode(int data) {
//    	        this.data = data;
//    	        this.next = null;
//    	    }
//    	}
//
//    
//    	        SingleNode singleNode = new SingleNode(10);
//    	        System.out.println("Node value:: " + singleNode.data + " ref >>> " + singleNode.next);
    	    }
    	

    	
    	
    

