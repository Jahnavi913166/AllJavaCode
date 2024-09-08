package com.RevisionSection.syncronization;

//class TotalEarning extends Thread {
//    int total = 0;
//
//    @Override
//    public void run() {//thread-0
//        for (int i = 1; i <= 10; i++) {
//            total += 100;//per tickets 100 rs
//        }
//    }
//
//}
//
//public class WaitNotifyNotifyAll {//MovieBookApp
//
//    public static void main(String[] args) {//main thread
//        TotalEarning t1 = new TotalEarning();//thread-0
//        t1.start();
//        System.out.println("total earnings:" + t1.total);
//    }
//}

//to solve the problem we use wait() and notify()
class TotalEarning extends Thread {
    int total = 0;

    @Override
    public void run() {//thread-0
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;//per tickets 100 rs
            }
            this.notify();//here after executing this thread-0 will release the lock and give back to main thread

        }

    }
}

public class WaitNotifyNotifyAll {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning t1 = new TotalEarning();//thread-0
        t1.start();
        synchronized (t1) {
            t1.wait();//main thread will release the lock(main thread-pause state) and thread-0 acquired the lock
            //main thread acquired the lock
            System.out.println("total Earning:" + t1.total);
        }
    }
}


