package com.training.ThreadConcept;

class Examples {
    public static void testThread() {

        //methods of thread
        //currentThread()->it return the current thread reference
        //getName()-> it return the thread name
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 4; i++) {
                    System.out.println("i=" + i + " " + Thread.currentThread().getName());//Thread-0->current thread name which is by default provided by java
                }
            }
        },"thread first");//if we want to give thread name explicitly
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 1; j < 4; j++) {
                    System.out.println("j=" + j + " " + Thread.currentThread().getName());//Thread-1 ->current thread name
                }
            }
        },"thread sec");
        Thread t3 = new Thread(new Runnable() {//this thread contain implicit thread name
            @Override
            public void run() {
                for (int k = 1; k < 4; k++) {
                    System.out.println("k=" + k + " " + Thread.currentThread().getName());//Thread-2 ->current thread name
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }

}

public class ThreadMethods {
    public static void main(String[] args) {
        Examples.testThread();
        //java give the thread names implicit
        System.out.println("main method also have thread: " + Thread.currentThread().getName());//thread name=> main

    }
}
