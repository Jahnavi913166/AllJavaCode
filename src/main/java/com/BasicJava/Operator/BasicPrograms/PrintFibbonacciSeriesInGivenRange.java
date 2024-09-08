package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

//given range =10  0 1 1 2 3 5 8-> under 10
public class PrintFibbonacciSeriesInGivenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range= sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        while(true){
            int c=a+b;
            if(c>=range) break;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
