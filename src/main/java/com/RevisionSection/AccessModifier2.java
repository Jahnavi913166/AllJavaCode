package com.RevisionSection;

public class AccessModifier2 {

     static void funcAccessModifier2(){
        System.out.println("AccessModifier2");
     }

    public static void main(String[] args) {
        //for same package if it is public we can access it anywhere inside the package or outside the package
        AccessModifier1.funcAccessModifier1();
       AccessModifier1 a1=new AccessModifier1();
        System.out.println(a1.access);
        AccessModifier1.getA();


       Integer[] i=new Integer[-1];


    }
}
