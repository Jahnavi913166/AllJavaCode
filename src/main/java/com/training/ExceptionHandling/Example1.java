package com.training.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        System.out.println("Main start");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        //we can handle the exception using try catch block
        try {
            c = a / b;//implicit throw the exception
            System.out.println("result is: " + c);
        } catch (ArithmeticException | InputMismatchException e) { //but explicit catch
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("enter a number:");
            sc.next();
            int d = sc.nextInt();
            int e = d * d;
            System.out.println("square is:" + e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main end");

    }

}
