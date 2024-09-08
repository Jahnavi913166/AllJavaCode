package com.BasicJava.Operator;

public class TestCode {
    static String m1() {
        int sum = 10 + 2;
        int pro = 1 * 3;
        return sum + "," + pro;
    }


    double methodA(byte x, double y) /* Line 3 */ {
        return (long) x / y * 2;
    }

    public static void m2() {
        class Foo {
            public int i = 3;
        }
        Foo foo = new Foo();
        System.out.println("i = " + foo.i);
    }

    void A() /* Line 3 */ {
        System.out.println("Class A");
    }


    public static void main(String[] args) {
//        int x = 20;
//        String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
//        System.out.println(sup);
//
//        int a = 3;
//        int b = 4;
//        System.out.print(" " + 7 + 2 + " ");
//
//        String[] res = m1().split(",");
//        System.out.println(res[0] + " " + res[1]);
        m2();
        new TestCode();

    }
}
