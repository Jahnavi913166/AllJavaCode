package com.RevisionSection.Exception;
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // myDog is of type Animal but actually a Dog
        Cat myCat;

        try {
            // This will throw ClassCastException at runtime
            myCat = (Cat) myDog;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
