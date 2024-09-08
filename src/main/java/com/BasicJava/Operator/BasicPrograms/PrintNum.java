package com.BasicJava.Operator.BasicPrograms;
//print the result like this -> 1+2+3+4+5=15

import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        System.out.println("Enter the no of times to want to add number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//times
        int sum = 0;
        /*
        for(int i=1;i<=5;i++){
            sum+=i;
            System.out.print(i);
            if(i<n)
               System.out.print("+");
        }
        System.out.println("="+sum);
        */

        //i want to store the result in the form of string
        String res = "";
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i < n) {
                res += i + "+"; //1+2+3=6
            } else {
                res += i;
            }
        }
        res += "=" + sum;
        System.out.println(res);

    }
}
