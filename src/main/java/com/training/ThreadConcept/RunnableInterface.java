package com.training.ThreadConcept;

class Example {
    public static void testThread() {
        // A is a runnable object
        A obj1 = new A();
        B obj2 = new B();
        //Thread(Runnable task)
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        //thread doesn't execute automatically we need to start it
        t1.start();
        t2.start();//they both execute parallel
    }
}

class A implements Runnable {
    public void f1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i=" + i);
        }
    }

    @Override
    public void run() {
        f1();
    }
}

class B implements Runnable {
    public void f2() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("j=" + j);
        }
    }

    @Override
    public void run() {
        f2();
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Example1.testThread();
    }
}
