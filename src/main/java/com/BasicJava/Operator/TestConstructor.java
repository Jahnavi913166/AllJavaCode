package com.BasicJava.Operator;

class A {
//    A() {
//    }

    A(String text) {
        System.out.println(text);
    }

}

class B extends A {
    B(String childConstrutor) {
        super("parent constructor");
    }

//    B(String text) {
//        System.out.println(text);
//    }


}

public class TestConstructor {
    public static void main(String[] args) {
        new B("Child Construtor");
    }
}
