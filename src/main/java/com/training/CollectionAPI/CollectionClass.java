package com.training.CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(29);
        list.add(29);
        list.add(29);
        list.add(34);
        list.add(9);
        list.add(30);
        System.out.println(list);
        System.out.println("min element: " + Collections.min(list));
        System.out.println("max element: " + Collections.max(list));

        //to check element frequency/occurrence
        System.out.println("Occurrence of 29: " + Collections.frequency(list, 29));

        //to sort element using collections class
        Collections.sort(list);
        System.out.println("sort (natural ordering): " + list);//ascending ordering

        //we can change its ordering
        //using Comparator ->to provide an ordering for collections of objects that don't have a natural ordering
        Collections.sort(list, Comparator.reverseOrder());//descending ordering
        System.out.println("sort(using comparator it change natural ordering)" + list);

    }
}
