package com.Algorithm.bitManipulation;

public class Example1 {
    public static void main(String[] args) {
//        int a=~5;
//        System.out.println(a);
        //right shift
//        int a=7>>3;
//        System.out.println(a);
//
//        //left shift
//        int b=9<<4;
//        System.out.println(b);


        //right shift by 1 ->means you are multiple a number by 2
        int a = 3;
        int b = a << 1;//a*2
        System.out.println(b);

        int c = a >> 1;//a/2;
        System.out.println(c);

        //even /odd
        for (int i = 1; i <= 10; i++) {
            if ((i & 1) == 0) {
                System.out.println(i);
            }
        }

        //swapping number
        int x = 5;
        int y = 7;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " " + y);




    }
}
