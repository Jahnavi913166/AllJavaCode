package com.RevisionSection.Classes;

class I {
    int a = 20;
    static int b = 20;

    public static void m1() {
    }

    public void m2() {
    }

}

class J extends I {



}

public class MethodHiding1 {
/*
->Static variables are inherited and shared among all instances of both parent and child classes. Changing a static variable affects all instances of the class.
->Instance variables are not shared and are specific to the object in which they are defined.
->Static methods are also inherited, but if you define a static method with the same name in the child class, the parent's static method is hidden, not overridden.
 */
    public static void main(String[] args) {
        I i1 = new I();
        I i2 = new J();
        i2.a=45;//non-static (effect for particular object)
        // Modifies the static variable 'b' at the class level (affects both I and J)
        i2.b=34;//static(effect for entire class)
        System.out.println(i1.a + " " + i2.a);
        System.out.println(i1.b+" "+i2.b);




    }

}
