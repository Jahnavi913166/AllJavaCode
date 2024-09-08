package com.training.ThreadConcept;

class Chicken {
    private int eggNo;

    public void setEggNo(int eggNo) {
        this.eggNo = eggNo;
        System.out.println("set egg no:" + eggNo);
    }

    public int getEggNo() {
        System.out.println("get egg no:" + eggNo);
        return eggNo;
    }


}

class Producer implements Runnable {
    Chicken chicken;

    Producer(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            chicken.setEggNo(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    Chicken chicken;

    Consumer(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void run() {
        int i;
        while (true) {
            i = chicken.getEggNo();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}

public class Polling {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();//this class is common between Consumer and Producer
        Consumer consumer = new Consumer(chicken);
        Producer producer = new Producer(chicken);
        //If something is common between two threads that is critical section
        Thread t1 = new Thread(consumer, "Consumer Thread");//t1 and t2 both thread are independent on each other
        Thread t2 = new Thread(producer, "Producer Thread");
        t1.start();
        t2.start();

        //wait ,notify is a method of Object class


    }
}
