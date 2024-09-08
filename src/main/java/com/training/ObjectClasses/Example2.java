package com.training.ObjectClasses;
class ComplexNumber1 {
    private int real, img;

    public void setComplexNumber(int r, int i) {
        real = r;
        img = i;
    }

    //override toString() method
    @Override
    public String toString() {
        return real + "+" + img + "i";
    }

}
public class Example2 {
    public static void main(String[] args) {
        ComplexNumber1 complex1 = new ComplexNumber1();
        ComplexNumber1 c=new ComplexNumber1();
        complex1.setComplexNumber(3, 4);
        System.out.println(complex1);
        System.out.println(complex1.hashCode());//189568618 unique code of object
        System.out.println(c);
        System.out.println(c.hashCode());//793589513 unique code of object

    }
}
