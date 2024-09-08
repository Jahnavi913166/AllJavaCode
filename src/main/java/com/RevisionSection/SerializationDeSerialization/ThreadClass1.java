package com.RevisionSection.SerializationDeSerialization;

class Thread1 extends Thread {
    @Override
    public void run() {
        //run() calls automatically
        System.out.println("run() Thread1 starts");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("run() Thread1 ends");
    }


}

public class ThreadClass1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();//start the thread execution;(New Thread Creation: A new thread is created.)
        t1.run();//(No New Thread: No new thread is created.)
        //if we run both thread together than it will run parallel

        //can we call start() method more than one time for same thread
        //(No we cannot call ,because it will throw IllegalThreadStateException)
        t1.start();//IllegalThreadStateException

    }
}
