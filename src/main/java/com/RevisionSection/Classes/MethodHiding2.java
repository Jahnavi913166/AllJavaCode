package com.RevisionSection.Classes;
/*
->Static methods are also inherited, but if you define a static method with the same name in the child class,
the parent's static method is hidden, not overridden.
*/

class Parent1 {

    public static void display() {
        System.out.println("Display Parent");
    }

}

class Child1 extends Parent1 {
    public static void display() {
        System.out.println("Display Child");
    }

}


public class MethodHiding2 {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        p1.display();
        Parent1 p2 = new Child1();
        p2.display();
        Child1 c=new Child1();
        c.display();
    }
}

