package com.parul23rd;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueImp1 {

    public static void main(String[] args) {
        Queue<String> stringQue = new LinkedList<String>();
        stringQue.offer("Java");
        stringQue.offer("C++");
        stringQue.offer("Python");
        stringQue.offer("AI/ML");
        
        stringQue.poll();
        stringQue.offer(null);
        
        System.out.println(stringQue);
        Iterator itr=stringQue.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
    }
}
