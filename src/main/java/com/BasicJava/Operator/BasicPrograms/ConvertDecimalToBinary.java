package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimalNum:");
        int decimalNum = sc.nextInt();
        //storing the result in string
//        String str = " ";
//        while (decimalNum > 0) {
//            str = (decimalNum % 2) + str;
//            decimalNum /= 2;
//        }
//        System.out.println("decimal to binary:" + str);

        //storing the result in integer
        int binary = 0, i = 1;
        while (decimalNum > 0) {
            int bit = decimalNum % 2;
            binary = (bit * i) + binary;
            i *= 10;
            decimalNum /= 2;
        }
        System.out.println("decimal to binary:" + binary);

    }
}
