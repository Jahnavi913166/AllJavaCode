package com.training.AccessModifier;

class A {
 public static void display()
 {
     System.out.println("tessa");
 }

}

public class AccessModifier1 {
    //only public class can be accessible directly outside the package
    //class AccessModifier1 -> this class can't be access outside the package but it can be accessible within same package
    //public class AccessModifier1 -> this class can be accessible outside the package even same package also.

    //there could be two possibility for class
    //1.it can be public
    //2.it can be default
    //it can't be private or protected

    //you can't access default class directly but you can access it indirectly via function
    public void f1() {
        System.out.println("hello");
        A a = new A();
        A.display();

        Example2 e=new Example2();
        //e.a; default member can be access it can be accessible classes of same package
    }


}

