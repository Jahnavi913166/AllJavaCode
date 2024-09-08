package com.RevisionSection.Classes;

import java.util.ArrayList;
import java.util.List;

interface Switch {
    void turnOn();

    void turnOff();
}

class Bulb implements Switch {
    private int button;

    @Override
    public void turnOn() {
        System.out.println("Bulb is blowing");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb stop blowing");
    }

    public int getButton() {
        return button;
    }

}

class Fan implements Switch {
    @Override
    public void turnOn() {
        System.out.println("fan start rotating");
    }

    @Override
    public void turnOff() {
        System.out.println("fan stop rotating");
    }
}


public class InterfaceImplementation {
    public static void main(String[] args) {
        Switch s;
        s = new Bulb();
        s.turnOn();
        s.turnOff();

        s = new Fan();
        s.turnOn();
        s.turnOff();

    }
}
