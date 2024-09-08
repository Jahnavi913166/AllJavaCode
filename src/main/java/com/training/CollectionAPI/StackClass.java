package com.training.CollectionAPI;
import java.util.List;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s.peek());


      //stack class can also have list method
        s.add(23);
        System.out.println(s);

        s.add(2,11);
        System.out.println(s);

        List<Integer> integers=new Stack<>();
        s.addAll(integers);
        System.out.println(s);

        //contains,clear,remove by index,remove by object

        //to iterate we have same process
        for(Integer i:s){
            System.out.println(i);
        }
    }
}
