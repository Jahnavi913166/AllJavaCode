package com.training.ExceptionHandling;

import java.security.spec.ECField;

public class Example2 {

    public static void main(String[] args) {
//        String s;
//        int a;
//        System.out.println(s.length());
//        System.out.println(a);
//  you can't use local variable without initializing

        try {

            System.out.println("start");
            System.out.println(3/0);
            System.out.println("end");//this line won't execute

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
