package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {
        System.out.println("Enter amount:");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if (amt >= 2000) {
            System.out.println("2000 x " + (amt / 2000));
            amt %= 2000;
            //System.out.println(amt);//this line is not need here we are just checking what is in the amt currently
        }
        if (amt >= 500) {
            System.out.println("500 x " + (amt / 500));
            amt %= 500;
           // System.out.println(amt);
        }
        if(amt>=200){
            System.out.println("200 x "+(amt/200));
            amt%=200;
        }
        if(amt>=100){
            System.out.println("100 x "+(amt/100));
            amt%=100;
        }
        if(amt>=50){
            System.out.println("50 x "+(amt/50));
            amt%=50;
        }
        if(amt>=1){
            System.out.println("1 x "+(amt/1));
            amt%=1;
        }

    }
}
