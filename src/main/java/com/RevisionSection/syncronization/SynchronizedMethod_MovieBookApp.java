package com.RevisionSection.syncronization;

class BookTheaterSeat {
    int total_seats = 10;

    //one thread execute at a time synchronized method
    synchronized void book_seats(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " Seats are booked successfully");
            total_seats -= seats;
            System.out.println("seats lefts:" + total_seats);
        } else {
            System.out.println("Sorry Seats cannot be booked");
            System.out.println("seats lefts:" + total_seats);
        }
    }

}

public class SynchronizedMethod_MovieBookApp extends Thread {
    static BookTheaterSeat b;
    int seats;

    @Override
    public void run() {
        b.book_seats(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        //so here one thread can execute at a time
        SynchronizedMethod_MovieBookApp shubham = new SynchronizedMethod_MovieBookApp(); //Thread1
        shubham.seats = 7;
        shubham.start();


        SynchronizedMethod_MovieBookApp Jaya = new SynchronizedMethod_MovieBookApp();  //Thread2
        Jaya.seats = 6;
        Jaya.start();
    }
}
