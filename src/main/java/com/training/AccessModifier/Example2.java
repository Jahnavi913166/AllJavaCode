package com.training.AccessModifier;

public class Example2 {
    int a;//default member

    //inner class can be public
    public class A1 {
        int b = a;

    }

    public static void main(String[] args) {
        AccessModifier1 e=new AccessModifier1();
        e.f1();
        Example2 e1=new Example2();
        System.out.println(e1.a);



    }
}
