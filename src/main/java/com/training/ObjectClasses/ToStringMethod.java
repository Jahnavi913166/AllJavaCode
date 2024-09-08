package com.training.ObjectClasses;

class ComplexNumber {
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

public class ToStringMethod {
    public static void main(String[] args) {
        ComplexNumber complex = new ComplexNumber();
        complex.setComplexNumber(3, 4);
//        System.out.println(complex); before overriding( com.training.ObjectClasses.ComplexNumber@6d03e736)
//        com.training.ObjectClasses.ComplexNumber@6d03e736
//       com.training.ObjectClasses->package
//        ComplexNumber-> class
//        @6d03e7360->(this is not the address of object)hashcode which is provided by java to give a unique number to object
//        hashcode actually it is not an address it is just provided by java to uniquely identify object
//        java internally use hashcode to access objects
//        when we write this  System.out.println(complex); it  convert complex->complex.toString()
        System.out.println(complex);
//        string representation of  obj how?
//        3 , 4 -> this value are stored in object
//        | real=3 img=4 |->object memory
//        System.out.println(complex);
//        toString()->used to convert object into string
//        "3+4i"-> it is representing here as string



    }

}
