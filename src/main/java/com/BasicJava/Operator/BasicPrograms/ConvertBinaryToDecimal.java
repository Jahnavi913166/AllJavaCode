package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number:");
        long binaryNum = sc.nextLong();
        int i = 1, sum = 0;
        while (binaryNum > 0) {
            int bit = (int) (binaryNum % 10);
            sum += (bit * i);
            i *= 2;
            binaryNum /= 10;
        }
        System.out.println(sum);
    }
}
