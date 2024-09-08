package com.BasicJava.Operator.BasicPrograms;

public class AddEvenAndOddSeparatly {
    public static void main(String[] args) {
        int eSum = 0, oSum = 0, num = 33345678;
        while (num > 0) {
            int check = num % 10;
            if (check % 2 == 0) {
                eSum += check;
            } else {
                oSum += check;
            }
            num /= 10;
        }
        System.out.println("EvenSum:" + eSum);
        System.out.println("OddSum:" + oSum);
         System.out.println("test");
    }
}
