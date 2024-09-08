package com.training.ExceptionHandling;

import java.util.Scanner;

public class Example3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        if(b==0){
            throw new ArithmeticException("cannot divide by zero");//explicitly throw  exception but implicit catch(java default handler)
        }
        c=a/b;
        System.out.println("Result: "+c);
    }

}
