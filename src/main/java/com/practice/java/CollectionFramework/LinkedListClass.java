package com.practice.java.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void reverseLinkedList(LinkedList<Integer> ll){
        int temp=0;
        int i=0,j=ll.size()-1;
        while(i<j){
            temp=ll.get(i);
            ll.set(i,ll.get(j));
            ll.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        /*
        LinkedList<Integer> ll = new LinkedList<>();
        //to add the object
        ll.add(10);
        ll.addFirst(23);
        ll.addLast(24);
        System.out.println(ll);

        //to see the object
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());

        System.out.println(ll.element());

        System.out.println(ll.clone());

        System.out.println(ll.get(0));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println(ll);
        System.out.println(ll.remove());
        System.out.println(ll.remove(1));

        System.out.println(ll.contains(10));//return true if not then false
        System.out.println(ll.indexOf(10));
        System.out.println(ll.size());

        ll.set(0, 900);
        System.out.println(ll);

        //used to add values
        ll.offer(23);
        ll.offer(24);
        ll.offerFirst(80);
        ll.offerLast(70);
        System.out.println(ll);

        // remove /poll used to remove element in linkedlist
        //ll.poll();
        //ll.pollFirst();
        //ll.pollLast();
        System.out.println(ll);


        //iterate value in linkedlist
        System.out.println("\n---------------------------------");
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

        System.out.println("\n---------------------------------");
        for(Integer val:ll){
            System.out.println(val);
        }

        System.out.println("\n---------------------------------");
        Iterator<Integer> iterator=ll.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
        Iterator<Integer> iterator1=ll.descendingIterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+"\t");
        }

        ll.offer(23);
        ll.offer(23);

        ll.removeFirstOccurrence(23);
        ll.removeLastOccurrence(23);
        System.out.println(ll);

        ll.pop();
        System.out.println(ll);
        System.out.println(ll.peek());
        ll.push(1000);
        System.out.println(ll);

         */


        //Reverse a Linked List:
        //1,2,3,4,5 --> 5 4 3 2 1
        //1->2->3->4->5
        LinkedList<Integer> ll = new LinkedList<>();
        ll.offer(1);
        ll.offer(2);
        ll.offer(3);
        ll.offer(4);
        ll.offer(5);
        System.out.println(ll);
        reverseLinkedList(ll);
        System.out.println(ll);

    }
}
