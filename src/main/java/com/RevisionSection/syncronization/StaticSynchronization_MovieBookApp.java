package com.RevisionSection.syncronization;

class BookThreaterSeat {
    static int totalSeats = 20;

    static synchronized void book_Seats(int seats) {
        if (totalSeats >= seats) {
            System.out.println(seats + "booked successfully");
            totalSeats -= seats;
            System.out.println("left seats:" + totalSeats);
        } else {
            System.out.println("sorry seats cannot be booked due to shortage of seats" + seats);
            System.out.println("left seats:" + totalSeats);
        }
    }

}

class myThread1 extends Thread {
    BookThreaterSeat b;
    int seats;

    myThread1(BookThreaterSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run() {
        b.book_Seats(seats);
    }


}

class myThread2 extends Thread {
    BookThreaterSeat b;
    int seats;

    myThread2(BookThreaterSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run() {
        b.book_Seats(seats);
    }

}

public class StaticSynchronization_MovieBookApp {
    public static void main(String[] args) {
        BookThreaterSeat b1 = new BookThreaterSeat();//b1 ->seats are 20
        myThread1 t1 = new myThread1(b1, 11);
        t1.start();
        myThread2 t2 = new myThread2(b1, 14);
        t2.start();

        BookThreaterSeat b2 = new BookThreaterSeat();//b2 ->seats are  also 20(object level lock)
        myThread1 t3 = new myThread1(b2, 13);
        t3.start();
        myThread2 t4 = new myThread2(b2, 15);
        t4.start();
    }
}
