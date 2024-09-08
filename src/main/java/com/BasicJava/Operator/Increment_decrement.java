package com.BasicJava.Operator;

public class Increment_decrement {
    public static void main(String[] args) {
        /*
        int i = 11;
        i = i++ + ++i;
        System.out.println("i: "+i);

        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a:" + a + " b:" + b + " c:" + c);


        int i = 0;
        i = i++ - --i + ++i - i--;
        System.out.println("i: "+i);


        boolean b = true;
        b++;
        System.out.println(b);//compile time error


        int i=1, j=2, k=3;

        int m = i-- - j-- - k--;

        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("m="+m);


        int a=1, b=2;
        System.out.println("a: "+a+" b:"+b);
        System.out.println(--b - ++a + ++b - --a);

        int i=19, j=29, k;
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);

        int i = 11;
        int j = --(i++);//compilation error


        int m = 0, n = 0;
        int p = --m * --n * n-- * m--;
        System.out.println("m: "+m+" n: "+n+" p: "+p);

         */
        int a=1;
        a = a++ + ++a * --a - a--;
        System.out.println(a);
    }
}
