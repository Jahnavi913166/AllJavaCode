package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

//145 ->calculate factorial of each digit
//5!=120,4!=24,1!=1 == sum(120+24+1)=145
//145==145 ->StrongNo
public class StrongNo {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        while (n > 0) {
            fact *= n;

            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        int cpy = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int temp = factorial(digit);
            sum += temp;
            num /= 10;
        }
        if (cpy == sum)
            System.out.println("strong no");
        else
            System.out.println("not a strong no");

    }
}
