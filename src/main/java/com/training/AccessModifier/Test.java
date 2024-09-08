package com.training.AccessModifier;

interface Vehicle {
//       by default public  static final
    int tire=4;

    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }
    static void openDoor(){
        System.out.println("door opening");
    }

}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }

    // No implementation of stop() provided, will use default implementation
}



public class Test {


    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop(); // Output: Vehicle stopped
             System.out.println(car.tire);
        Vehicle.openDoor();

        Bike bike = new Bike();
        bike.start();
        bike.stop(); // Output: Vehicle stopped

    }
    }







