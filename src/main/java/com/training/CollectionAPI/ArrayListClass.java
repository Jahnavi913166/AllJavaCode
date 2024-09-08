package com.training.CollectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    //    default size pf arraylist is 10 and it will increase the size dynamically
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);

        //ADD ELEMENT AT THE END OF THE LIST
        list.add("Shubham");
        list.add("Jaya");
        list.add("Uma");
        list.add("Vijay");
        list.add("Jay");
        list.add("lalla");
        list.add("Jahnavi");
        System.out.println("add: " + list);

        //ADD ELEMENT IN BETWEEN
        list.add(2, "Ashwani");
        System.out.println("add in between: " + list);

        //TO GET THE ELEMENT
        System.out.println("get: " + list.get(1));

        //TO EXTEND LIST
        List<String> newlist = new ArrayList<>();
        newlist.add("priya");
        newlist.add("neha");
        list.addAll(newlist);
        System.out.println("extend the list: " + list);

        //TO REMOVE ELEMENT
        list.remove(1);
        System.out.println("remove by index: " + list);

        list.remove("priya");
        System.out.println("remove by object: " + list);

        //TO CHECK OBJECT EXISTS OR NOT
        System.out.println(list.contains("jaya"));//false
        System.out.println(list.contains("Shubham"));//true


        //there are three way to iterate the objects
        //iterate the values
        /*
        System.out.println();
        System.out.println("iterate the objects");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
         */

        //for each
        /*
        System.out.println();
        System.out.println("for each loop");
        for(String l:list){
            System.out.println(l);
        }
        */


        //normal for loop
        System.out.println();
        System.out.println("normal for loop");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //TO CLEAR ALL THE LIST
        //list.clear();
        // System.out.println(list);

    }

}
