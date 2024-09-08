package com.RevisionSection.Exception;

public class ExceptionPropagation {
    static void m1() {
        System.out.println("m1() starts");
        try {
            m2();
        } catch (ArithmeticException e) {
            System.out.println("execution is handled in m1()");
            // e.printStackTrace();
        }
        System.out.println("m1() end");
    }

    static void m2() {
        System.out.println("m2() starts");
        int a = 10 / 0;
        System.out.println("m2() end");
    }


    public static void main(String[] args) {
        System.out.println("main starts");
        m1();
        System.out.println("main ends");
//        for(int i=0;;i++){ infinite loop
//            System.out.println(i);
//        }


    }
}
