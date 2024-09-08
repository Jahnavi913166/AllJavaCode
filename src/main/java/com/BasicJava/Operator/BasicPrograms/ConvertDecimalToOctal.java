package com.BasicJava.Operator.BasicPrograms;

public class ConvertDecimalToOctal {
    public static void main(String[] args) {
        int decimal = 72;
        int octal = 0, i = 1;
        while (decimal > 0) {
            int bit = decimal % 8;
            octal = (bit * i) + octal;
            i *= 10;
            decimal /= 8;
        }
        System.out.println(octal);
    }
}
