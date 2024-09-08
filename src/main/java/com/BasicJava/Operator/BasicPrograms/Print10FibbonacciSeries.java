package com.BasicJava.Operator.BasicPrograms;

// 0 1 1 2 3 5 8 11 19.....
public class Print10FibbonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
