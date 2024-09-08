package com.training.NestedClasses;

class A {
    public void show() {
        System.out.println("In A show");
    }

}

//class B extends A {
//    public void show() {
//        System.out.println("In B show");
//    }
//
//} this is time consuming way

public class AnonymousClass {
    public static void main(String[] args) {
        A a = new A() {
            //Anonymous inner Class
            @Override
            public void show() {
                System.out.println("Anonymous class");
            }

        };
        a.show();


    }
}
