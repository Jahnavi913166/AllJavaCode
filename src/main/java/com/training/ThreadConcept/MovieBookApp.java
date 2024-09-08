package com.training.ThreadConcept;

class TotalEarning extends Thread {
    int total = 0;


    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;
            }
            this.notify();
        }
    }

}

class A1 extends Thread {
     public void run(){
         System.out.println("run method invoke..");
     }

}

public class MovieBookApp {
    public static void main(String[] args) throws InterruptedException {//main thread
        TotalEarning thread = new TotalEarning();
        thread.start();//Thread-0
        // System.out.println("Total earning:" + t.total + " rs");//it will run main thread
        // it has to give the result of total-earning but the reason is that when the run function is executing the method so at that time or main thread is execute
        synchronized (thread) {
//            thread.wait();
            thread.wait(1000);
            System.out.println("Total earning:" + thread.total + " rs");
        }


       /* A1 a = new A1();
        a.run();
        */
        /*thread.run(); if we use run method directly so it will directly call this method
        System.out.println("Total earning:" + thread.total + " rs")*/
    }
}
