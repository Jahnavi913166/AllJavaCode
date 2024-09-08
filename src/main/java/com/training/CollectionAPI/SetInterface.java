package com.training.CollectionAPI;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        //Set<Integer> set=new HashSet<>();//it arrange the element in ascending order and insertion order is not maintained
        //Set<Integer> set=new LinkedHashSet<>(); //it maintained insertion order
        Set<Integer> set=new TreeSet<>();//it insert element in sorted order
        set.add(23);
        set.add(24);
        set.add(20);
        set.add(56);
        set.add(2);
        set.add(1);
        System.out.println(set);

        //remove
        System.out.println(set.remove(2));//true(if object remove return true otherwise false)
        System.out.println(set);

        //object exists or not
        System.out.println(set.contains(23));//true(object exists or not)

        //isEmpty(),size()
        System.out.println(set.isEmpty());//false (not empty)

        System.out.println(set.size());//4
        set.clear();
        System.out.println(set);



    }
}
