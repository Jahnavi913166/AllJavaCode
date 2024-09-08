package com.RevisionSection.Classes;
//2. A Class Can Make Its Data Members Read-Only or Read-Write

class Employee1 {
    private String name;
    private double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Read-only property: No setter for name
    public String getName() {
        return name;
    }

    // Read-write property: Getter and setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {

    }
}
