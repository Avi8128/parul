package com.parul23rd;

import java.util.PriorityQueue;

import java.util.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PriorityQueueExample {

    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//
//        pq.offer(10);
//        pq.offer(1);
//        pq.offer(5);
//        pq.offer(-1);
//
//        System.out.println("PriorityQueue elements using Iterator:");
//        Iterator<Integer> itr = pq.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
    	   PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

           pq.offer(10);
           pq.offer(1);
           pq.offer(5);
           pq.offer(-1);

           // Poll elements and store in list
           List<Integer> list = new ArrayList<>();
           while (!pq.isEmpty()) {
               list.add(pq.poll());
           }

           // Sort in reverse order
           Collections.sort(list, Collections.reverseOrder());

           System.out.println("PriorityQueue elements in reverse order:");
           for (int num : list) {
               System.out.println(num);
        }
    }
}
