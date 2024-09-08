package com.RevisionSection.SerializationDeSerialization;

//without synchronization

class BookTheaterSeat {
    int total_seats = 10;

    void book_seats(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + "Seats are booked successfully");
            total_seats -= seats;
            System.out.println("seats lefts:" + total_seats);
        } else {
            System.out.println(seats + "seats cannot be booked");
            System.out.println("seats lefts:" + total_seats);
        }
    }

}

public class MovieBookApp extends Thread {
    static BookTheaterSeat b;
    int seats;

    @Override
    public void run() {
        //both thread will execute run method at the same time
        b.book_seats(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();
        //we cannot control thread threads execute parallel
        //data inconsistency
        MovieBookApp shubham = new MovieBookApp();
        shubham.seats = 7;
        shubham.start();


        MovieBookApp Jaya = new MovieBookApp();
        Jaya.seats = 6;
        Jaya.start();
    }
}
