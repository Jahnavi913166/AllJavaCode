package com.practice.java.CollectionFramework;
 /*     peek top
    |      |2
    |      |1
    |______|0
       bottom
  */

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackClasses {
    public static void main(String[] args) {
        //List<String> s=new Stack<>();
        Stack<String> s = new Stack<>();
        //push pop or peek

        s.push("A");
        s.push("B");
        s.push("C");
        s.addElement("er");
        System.out.println(s);

        //s.removeElementAt(2);
        System.out.println(s);
        //s.pop();
        System.out.println(s);

        //to see the element at the top of the stack
        System.out.println(s.peek());
        System.out.println(s);

        //System.out.println(s.subList(1,3));
        s.add(2,"100");
        System.out.println(s);

        System.out.println(s.size());//before
        s.setSize(8);//used to set new size of stack
        System.out.println(s.size());//after

        //This method starts the count of the position from 1 and not from 0.
        System.out.println(s.search("100")); //return the position of the element from the top (6 POSITION FROM THE TOP SIZE 8 )
        //Search method of stack
        //Return Value: The method returns the position of the element
        //if it is successfully found in the stack (taking the count as base 1) else -1 is returned.

        //iterate stack
        System.out.println("\n-------------------------------");
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }

        System.out.println("\n-------------------------------");
        for(String val:s){
            System.out.println(val);
        }

        System.out.println("\n---------------------------------");
        Iterator<String> iterator=s.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }

    }


}
