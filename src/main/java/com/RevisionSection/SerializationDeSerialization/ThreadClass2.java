package com.RevisionSection.SerializationDeSerialization;

class Threads1 extends Thread {
    @Override
    public void run() {
        System.out.println("run() method start of Threads1 class");
        f1();
        System.out.println("run() method end of Threads1 class");

    }

    public static void f1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1 =" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}

class Threads2 extends Thread {
    @Override
    public void run() {
        System.out.println("run() method start of Threads2 class");
        f2();
        System.out.println("run() method end of Thread2 class");

    }

    public static void f2() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread2 =" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Test {
    public static void testMethod() {
        Threads1 t1 = new Threads1();
        t1.start();
        System.out.println(Thread.currentThread());//Thread[#1,main,5,main]
        System.out.println(t1.getName());//Thread-0
        Threads2 t2 = new Threads2();
        t2.start();
        System.out.println(t2.getName());//Thread-1




    }

}


public class ThreadClass2 {
    public static void main(String[] args) {
        Test.testMethod();
    }
}
