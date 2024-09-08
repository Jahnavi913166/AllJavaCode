package com.RevisionSection.Classes;

class Animal {
    String color = "white";
}

class Cats extends Animal {
    Cats() {
        String color = "Brown";
        System.out.println("animal: " + super.color);
        System.out.println(color);
    }
    public void sound(){
        System.out.println("meow");
    }


}

public class SuperKeyword_Constructor extends Cats {
    SuperKeyword_Constructor() {
        super();
        System.out.println("cats:" + super.color);
        System.out.println("The eyes of the cat is blue.");
        super.sound();
    }

    public static void main(String[] args) {
        new SuperKeyword_Constructor(); 
    }
}
