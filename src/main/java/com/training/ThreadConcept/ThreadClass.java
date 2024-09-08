package com.training.ThreadConcept;

class Example1 {
    public static void testThread() {
        C obj1 = new C();
        D obj2 = new D();
        obj1.start();//thread class method start()
        obj2.start();
    }

}

class C extends Thread {
    @Override
    public void run() {
        f1();
    }

    public void f1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 =:" + i);
        }
    }

}

class D extends Thread {//Thread implements Runnable -run() override ->start()
    @Override
    public void run() {
        f2();
    }

    public void f2() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 =:" + i);

        }
    }

}

public class ThreadClass {
    public static void main(String[] args) {
        Example1.testThread();
    }

}
