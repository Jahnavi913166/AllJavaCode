package com.RevisionSection.syncronization;

class BookTheaterSeats {
    int total_seats = 10;

    //one thread execute at a time synchronized method
    void book_seats(int seats) {
        //suppose we have multiple code inside in this method
        //both the thread will run this part
        System.out.println("h1:" + Thread.currentThread().getName());
        System.out.println("h1:" + Thread.currentThread().getName());
        System.out.println("h1:" + Thread.currentThread().getName());
        // but here we only perform synchronization in this below codes
        //make this code as synchronized block so that only here thread will waiting and also it reduces the thread waiting time
        //only one thread will execute synchronized block at a time
        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(seats + " Seats are booked successfully");
                total_seats -= seats;
                System.out.println("seats lefts:" + total_seats);
            } else {
                System.out.println("Sorry Seats cannot be booked");
                System.out.println("seats lefts:" + total_seats);
            }

        }
        //both the thread will run this part
        System.out.println("h1:" + Thread.currentThread().getName());
        System.out.println("h1:" + Thread.currentThread().getName());
        System.out.println("h1:" + Thread.currentThread().getName());


    }

}

public class SynchronizedBlock_MovieBookApp extends Thread {
    static BookTheaterSeats b;
    int seats;

    @Override
    public void run() {
        b.book_seats(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeats();

        SynchronizedBlock_MovieBookApp shubham = new SynchronizedBlock_MovieBookApp(); //Thread1
        shubham.seats = 7;
        shubham.start();


        SynchronizedBlock_MovieBookApp Jaya = new SynchronizedBlock_MovieBookApp();  //Thread2
        Jaya.seats = 6;
        Jaya.start();
    }
}
