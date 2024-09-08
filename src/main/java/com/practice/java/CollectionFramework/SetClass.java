package com.practice.java.CollectionFramework;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        //    Set<String> set=new HashSet<>();
        // Set<String> set = new LinkedHashSet<>();
        //set does have any insertion order
        Set<String> set = new TreeSet<>();
        set.add("Jaya");
        set.add("Shubham");
        set.add("Jahnavi");
        set.add("Riya");

        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.remove("Jaya"));
        System.out.println(set);
        System.out.println(set.contains("23"));

        //multiple no of set
        set.addAll(Arrays.asList(new String[]{"A", "B", "C"}));
        System.out.println(set);

        System.out.println("\n-----------------------------");
        Set<String> s = new LinkedHashSet<>();
        s.add("23");
        s.add("25");
        s.addAll(Arrays.asList(new String[]{"Jaya", "Jahnavi", "23"}));
        System.out.println(s);
        System.out.println(set);

        //retainAll-> intersection (it takes  only common element)
//        Mutability: The retainAll method modifies the original set.
//        Return Value: It returns true if the set was modified as a result of the operation, otherwise false.
        //set.retainAll(s);//intersection
        //System.out.println(set);

        System.out.println();
        System.out.println();

        //set.removeAll(Arrays.asList(new String[]{"Jaya", "A"}));
        //System.out.println(set);
        set.add("23");
        System.out.println(set);
        System.out.println(s);
        set.removeAll(s);
        System.out.println(set);
        s.removeAll(set);
        System.out.println(s);



//        System.out.println("----------------------------------");
//        for(String s:set){
//            System.out.println(s);
//        }
//
//        Iterator<String> iterator=set.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


    }

}
