package com.RevisionSection.CollectionFramework;

import java.util.*;

public class ListInterface {
    //ArrayList,LinkedList,Vector,Stack

    public static void main(String[] args) {
        //ArrayList
        /*
        ArrayList<Object> arr=new ArrayList<>();
        arr.add(23);
        arr.add(23.4);
        arr.add("Jaya");
        arr.add("Shubham");
        arr.add('a');
        System.out.println(arr);
        arr.add(2,'s');
        System.out.println(arr);
        arr.set(2,'r');
        System.out.println(arr);
        System.out.println(arr.lastIndexOf("Shubham"));

        //for iterating val
        for(Object ele:arr){
            System.out.print(ele+"\t");
        }

        for(int i=0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }

        Iterator<Object> iterator=arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //
        ListIterator<Object> listIterator= arr.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        */

        /*
        //vector
        List<Object> l=new Vector<>();
        Vector<Object> v = new Vector<>();//default capacity 10
        System.out.println(v.capacity());
        v.add(23);
        v.add('a');
        v.add(90);
        v.add("Jaya");
        v.add(1, "Java");
        System.out.println(v);
        System.out.println(v.capacity());

        v.set(2, "python");
        v.addElement("SQL");
        System.out.println(v);
        v.remove(3);
        System.out.println(v);

        Vector<Object> v1 = new Vector<>();
        v1.addElement(45);
        v1.addElement(23);
        v1.addElement("Java");
        v1.addElement(46);
        v1.add(45);

        System.out.println("\n\n");
        System.out.println(v1);
        System.out.println(v);
        v.removeAll(v1);//remove the first collection element which are present in second collection.
        System.out.println(v);
        System.out.println(v1);

        System.out.println("\n");
        System.out.println(v);
        v.setElementAt("Jaya", 0);
        System.out.println(v);

        v.removeElement("Jaya");
        System.out.println(v);
        v.removeElementAt(0);
        System.out.println(v);
        v.clear();
        System.out.println(v);
        Vector<Object> vector= (Vector<Object>) v.clone();
         */

        //List<Object> stack=new Stack<>();
        Stack<Object> stack = new Stack<>();
        //operation peek push pop
        stack.add(23);
        stack.add(34);
        System.out.println(stack);

        stack.push(39);
        stack.push(56);
        stack.push("Java");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.empty());


    }

}
