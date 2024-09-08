package com.training.OppsConcept;

interface Area {

    //    double PI; in interface by default the variable is final so we need to initailze while declaring
    double PI = 3.14;

    double getArea();//abstract method
}

class Circle implements Area {
    private double radius;

    public void setRadius(double radius) {
        double PI=23;
        System.out.println(PI);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }


}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5.0);
        System.out.println("Area of circle with radius:" + c.getRadius()+" is "+c.getArea());

        //we can also create the reference of interface
        Area A=new Circle();



    }

}
