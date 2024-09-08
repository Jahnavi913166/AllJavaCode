package com.RevisionSection.Exception;

import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) {
        System.out.println("Execution starts");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        try {
            System.out.println("Try starts");
            c = a / b;//ArithmeticException: / by zero (1/0)
            System.out.println("Try end");

        } catch (ArithmeticException e) {
            System.out.println("executing catch");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this always executed..");
        }
        System.out.println(c);
        System.out.println("Execution end");

    }
}
