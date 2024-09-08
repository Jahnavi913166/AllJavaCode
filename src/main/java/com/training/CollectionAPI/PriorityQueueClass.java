package com.training.CollectionAPI;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        // Queue<Integer> pq=new PriorityQueue<>();//by default it implements min heap
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//Comparator.reverseOrder() this method will change the order Max heap
        pq.offer(23);
        pq.offer(26);
        pq.offer(11);
        pq.offer(20);
        System.out.println(pq);//add

        System.out.println(pq.peek());//next element
        System.out.println(pq);


        System.out.println(pq.poll());//remove
        System.out.println(pq);

        //we can also change the priority of the queue
        //max heap



    }
}
