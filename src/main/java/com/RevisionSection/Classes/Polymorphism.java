package com.RevisionSection.Classes;

//method Overloading
//method overriding

//method Overloading
class Calculator {
    //same method and argument different
    int a, b, c;

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

//method overriding
class Parent {
    public void show() {
        System.out.println("Parent");
    }

}

class Child extends Parent {
    public void show() {
        System.out.println("Child");
    }

}

class Bike {
    final static int wheel = 2;

    void start() {
        System.out.println("Bike start");
    }


}

class Pulsar extends Bike {
    void start() {
        System.out.println("Pulsar start");
    }

}

class Rider {
    void ride(Bike b) {
        System.out.println("Executing ride(Bike)");
        b.start();
    }

    void ride(Pulsar p) {
        System.out.println("Executing ride(Pulsar)");
        p.start();
    }

}


public class Polymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));

        Parent p = new Child();
        p.show();//child call

        System.out.println();
        Rider r = new Rider();
        r.ride(new Bike());
        r.ride(new Pulsar());


    }
}
