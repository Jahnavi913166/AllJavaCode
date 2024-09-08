package com.BasicJava.Operator.BasicPrograms;

public class ConvertOctalToDecimal {
    public static void main(String[] args) {
//        int octal = 110;
//        int decimal = 0, i = 1;
//        while (octal > 0) {
//            int bit = octal % 10;
//            decimal += bit * i;
//            i *= 8;
//            octal /= 10;
//        }
//        System.out.println(decimal);
        StringBuilder s = new StringBuilder("110");
        int a = (s.charAt(s.length() - 1)) - 48;
        System.out.println(a);
        System.out.println(a);
        int sum = 0, i = 1;
        int len = s.length() - 1;
        while (s.length()!= 0) {
            char ch = s.charAt(len);
            int bit = ch - 48;
            sum += bit * i;
            i *= 8;
            if (s.charAt(len) == '0' || s.charAt(len) == '1') {
                s.setCharAt(len, ' ');
            }

        }


    }
}
