package com.training.CollectionAPI;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeClass {
    public static void main(String[] args) {
        //Queue<Integer> aq=new ArrayDeque<>();
        ArrayDeque<Integer> aq=new ArrayDeque<>();
        //add
        aq.offer(2);
        aq.offerFirst(25);
        aq.offerLast(29);
        aq.offer(24);
        System.out.println(aq);

        //remove
        System.out.println(aq.poll());
        System.out.println(aq.pollFirst());
        System.out.println(aq.pollLast());
        System.out.println(aq);

        //see
        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());

    }
}
