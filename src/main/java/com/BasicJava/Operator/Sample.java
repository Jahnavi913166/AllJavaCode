package com.BasicJava.Operator;

import java.util.Scanner;

public class Sample {
    public static void add(int n) {
        int sum = 0;
        String str = "";
        for (int i = 1; i <= n; i++) {
            sum += i;
            str += i;
            if (i < n) {
                str += "+";
            }


        }
        str += "=" + sum;
        System.out.println(str);
    }

    public static void mul(int n) {
        int mul = 1;
        String str = "";
        for (int i = 1; i <= n; i++) {
            mul *= i;
            str += i;
            if (i < n) {
                str += "*";
            }
        }
        str += "=" + mul;
        System.out.println(str);

    }

    public static void reverseAdd(int n) {
        int sum = 0;
        String str = "";//5
        for (int i = n; i >= 1; i--) {
            sum += i;


        }
        str += "=" + sum;
        System.out.println(str);
    }


    public static void main(String[] args) {
//        //1*2*3=6
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        char c3 = 0xbeef;

    }
}
