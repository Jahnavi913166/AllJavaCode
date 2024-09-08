package com.RevisionSection.Classes;

import java.util.Arrays;
import java.util.Comparator;

interface Human{
     int eye=2;
     void move();
}
interface Person extends Human{
    int leg=4;

    int hands=2;
    void write();
    void eat();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Human h=new Human() {
            @Override
            public void move() {
                System.out.println("I can move");
            }
        };
        h.move();
        Person p=new Person() {
            @Override
            public void write() {
                System.out.println("he can write");
            }

            @Override
            public void eat() {
                System.out.println("he can eat");
            }

            @Override
            public void move() {
                System.out.println("he can move");
            }
        };
        p.eat();
        Demo.method1();
    }

}
 class Demo{
    public static void method1(){
        String arr[]={"java","c","android"};
        Comparator c=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        };
        Arrays.sort(arr);
        for(String s:arr){
            System.out.println(s);
        }
    }

 }

