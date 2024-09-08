package com.training.ThreadConcept;
//sleep() to sleep the execution of thread for milliseconds
class E {
    public static void testThread() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 4; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("i=" + i + " " + Thread.currentThread().getName());//Thread-0->current thread name which is by default provided by java
                }
            }
        }, "thread first");//if we want to give thread name explicitly
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 1; j < 4; j++) {
//                    if (j == 2) {
//                        throw new ArithmeticException("throwing explicit exception");
//                    }
                    System.out.println("j=" + j + " " + Thread.currentThread().getName());//Thread-1 ->current thread name

                }
            }
        }, "thread sec");
        t1.start();
        t2.start();

    }
}


public class ThreadMethod {
    //to give custom thread name the advantage is that when any exception is occurr in thread so it is easy to identify which thread is giving exception
    public static void main(String[] args) {
        E.testThread();
    }
}
