package com.training.ObjectClasses;

class ComplexNumbers {
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
    public boolean equals(ComplexNumbers c) {
        return real == c.real && img == c.img;
    }


}

public class EqualsMethod {
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers();
        ComplexNumbers c2 = new ComplexNumbers();
        c1.setComplexNumber(3, 4);
        c2.setComplexNumber(4, 5);
        System.out.println("== equal operator");
        // == it compare two object reference and return boolean values
        System.out.println(c1 == c2);//false
        System.out.println(c1.hashCode() == c2.hashCode());//false

        //it is working properly right now
        //c1==c2-> another way to write->c1.hashCode()==c2.hashCode()
        System.out.println(c1.hashCode());//1828972342
        System.out.println(c2.hashCode());//1452126962
        //that means == compare the reference of that object

        ComplexNumbers c3;
        c3 = c1;
        System.out.println(c3 == c1);//true
        //obj1==obj2: whether obj1 and o bj2 are refering to same object in heap memory

        System.out.println("\n.equals() method");
        // .equals() method compare object data member /values if obj1 and obj2 are equal it return true otherwise false
        c1.setComplexNumber(3, 4);
        c2.setComplexNumber(3, 4);
        //System.out.println(c1.equals(c2));//false (without override) by default .equals() ->== it works similar
        System.out.println(c1.equals(c2));//true
        System.out.println(c3.equals(c1));//true


    }
}
