package com.RevisionSection.Classes;
//1.reuseAbility->The program which is developed for base type can run for any subtype
class Car {//base type
    final static int wheel=4;
    public int sheeter;
    public void start() {
        System.out.println("start the car");
    }

    public void stop() {
        System.out.println("stop the car");
    }
}
class Tata extends Car{//sub-type

}

public class AvantageOfPolymorphism {
    public static void main(String[] args) {
        Car car=new Tata();
        car.start();//reuse
        System.out.println(Tata.wheel);
        car.stop();
    }
}
