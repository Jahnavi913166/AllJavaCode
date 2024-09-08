package com.RevisionSection.Classes;
//in each and every clas Object class is inherited by default
class A {
    public static void m1() {
        System.out.println("Parent");
    }
}

class B extends A {
    public static void m2() {
        System.out.println("child");
    }
}

class C {

}

class X {
}

class Y extends X {
}

class Z extends Y {
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new B();//true
        System.out.println("a instanceof B: " + (a instanceof B));//true
        System.out.println("a instanceof Object: "+(a instanceof Object));

        System.out.println();
        //System.out.println(a instanceof C);//false //compile time error
        A a1 = new A();//false
        System.out.println("a1 instanceof  B: " + (a1 instanceof B));

        System.out.println();
        X x1 = new Z();
        System.out.println("x1  instanceof Y: " + (x1 instanceof Y));//true
        System.out.println("x1 instanceof X: " + (x1 instanceof X));//true
        System.out.println("x1  instanceof Z: " + (x1 instanceof Z));//true

        System.out.println();
        X x2=new Y();
        System.out.println("x2  instanceof Z: " + (x2 instanceof Z));//false(because y is not an instance of z)
        System.out.println("x2  instanceof Y: " + (x2 instanceof Y));//true


        //Always true
        System.out.println("x1 instanceof Object: "+(x1 instanceof Object));
        System.out.println("x2 instanceof Object: "+(x2 instanceof Object));


        X x3=new Z();
        Y y=(Y)x3;//downCasting
        System.out.println(y instanceof  X);//explicitly making
        Z z=(Z)x3;
        System.out.println(z instanceof X);


    }
}
