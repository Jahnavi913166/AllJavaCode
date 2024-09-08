package com.training.ExceptionHandling;

import java.util.Scanner;

//explicit throw exception and explicit catch
public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero"); //explicit throw exception
            }
            int c=a/b;
            System.out.println("result :"+c);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());//explicit catch

        }

        }

    }
