package com.RevisionSection;

//for same package
public class AccessModifier1 {
    //1 public
    //int access=10;//if var is default we can only access it inside the package ,outside the package it won't allow us.
    public int access = 10;

    public static void funcAccessModifier1() {
        System.out.println("AccessModifier1");
    }

    //2.private
    private static int a = 10;

    public static void getA() {

        System.out.println(a);
    }


    public static void main(String[] args) {
// if that function is in same package or it is not public then u can access it easy
        AccessModifier2.funcAccessModifier2();
        System.out.println(a);

        System.out.println(Thread.currentThread().getName());//main thread
    }
}
