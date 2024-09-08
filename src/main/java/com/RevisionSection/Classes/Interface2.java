package com.RevisionSection.Classes;

interface Vehicle {
    void engine();

    void start();

    void stop();
}

interface Bikes extends Vehicle {
    int wheels = 2;

    void kickstart();
}

interface Cars extends Vehicle {
    int wheels = 4;

    void reverse();
}

class Pulser implements Bikes {

    @Override
    public void engine() {
        System.out.println("Engine start");
    }

    @Override
    public void start() {
        System.out.println("Bike  Start");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stop");
    }

    @Override
    public void kickstart() {
        System.out.println("kickstart");
    }
}

class Audi {

}


public class Interface2 {
    public static void main(String[] args) {
        Vehicle v;
        v = new Pulser();
        v.engine();
        v.start();
        Pulser p = ((Pulser) v);
        p.kickstart();
    }
}
