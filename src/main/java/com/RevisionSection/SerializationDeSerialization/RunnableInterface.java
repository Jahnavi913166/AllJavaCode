package com.RevisionSection.SerializationDeSerialization;

class Runnable1 implements Runnable {

    @Override
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
//        Runnable r = new Runnable1();
//        Thread t = new Thread(r);
        Thread t = new Thread(new Runnable1());
        t.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
