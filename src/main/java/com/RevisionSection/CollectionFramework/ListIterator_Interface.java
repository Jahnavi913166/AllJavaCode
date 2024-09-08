package com.RevisionSection.CollectionFramework;

import java.util.*;

public class ListIterator_Interface {
    public static void Shuffle() {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            li.add(i);
        }
        System.out.println("Original list:");
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);
        //System.out.println(Collections.binarySearch(li,3));
        Collections.shuffle(li);//this will rearrange element in random order
        // Shuffling the list with a seeded Random instance
        System.out.println(li);
        Random random = new Random(42); // Seeded Random for reproducibility
        Collections.shuffle(li, random);

        System.out.println("shuffle list:");
        System.out.println(li);
    }

    public static void main(String[] args) {
        /*
        List<Object> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Dragon");
        list.add(23);
        list.add(24);

        ListIterator<Object> listIterator=list.listIterator();
        System.out.println("Traversing the list forward:");
        //next(),hasNext(),add(),set()
        while(listIterator.hasNext()){
            Object b=listIterator.next();
            System.out.println(b);

            // Adding a fruit after "Banana"
            //we use add("Grapes") to insert a new element after it
                if(b.equals("Banana")){
                listIterator.add("Grapes");//this is added in between after the banana comes
            }
            //replacing cherry to its index
            if(b.equals("Cherry")){
                listIterator.set(list.lastIndexOf("Cherry"));
            }
        }
        System.out.println("Modified list");
        System.out.println(list);

        //previous(),hasPrevious(),remove()
        System.out.println("\n");
        System.out.println("Traversing the list backward:");
        while (listIterator.hasPrevious()){
            Object obj=listIterator.previous();
            System.out.print(obj+"\t");
            if(obj.equals(23)){
                listIterator.remove();
            }
        }
        System.out.println("\nAfter removing element:");
        System.out.println(list);


        System.out.println("\nmethod-> nextIndex() or previousIndex");
        while (listIterator.hasNext()){
            Object obj1=listIterator.next();
           System.out.print(obj1+" ");//val
            System.out.print(listIterator.nextIndex()+" ");//index
        }

        System.out.println("\n");

        while(listIterator.hasPrevious()){
            Object obj2=listIterator.previous();
            System.out.print(obj2+" ");//val
            System.out.print(listIterator.previousIndex()+" ");//index
        }
        System.out.println("\n"+list.size());

         */

        Shuffle();


    }
}


