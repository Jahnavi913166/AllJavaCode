package com.RevisionSection.Classes;

class Constructor1 {
    Constructor1() {
        this("called parameterized of the same class");
        System.out.println("Constructor1 is called");
        System.out.println();

    }

    Constructor1(String msg) {

        System.out.println("Constructor1 is" + msg);
    }

}

class Constructor2 extends Constructor1 {
    Constructor2() {
        super(" called parent class constructor");
        System.out.println("Constructor2 is called");
    }

    Constructor2(String msg) {
        super();
        System.out.println(msg);
    }
}


public class ConstructorChanning {
    public static void main(String[] args) {
        new Constructor2();
    }
}
