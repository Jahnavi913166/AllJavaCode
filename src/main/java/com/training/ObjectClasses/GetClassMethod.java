package com.training.ObjectClasses;

class ComplexNumbers1 {
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

    //override .equals() method
    public boolean equals(ComplexNumbers1 c) {
        return real == c.real && img == c.img;
    }


}

public class GetClassMethod {
    public static void main(String[] args) {
        ComplexNumbers1 c = new ComplexNumbers1();
        System.out.println("\n");
        System.out.println(c.getClass().getName());
    }

}
