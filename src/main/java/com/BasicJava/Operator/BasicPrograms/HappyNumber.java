package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

//eg-3628 ->sum the digits 3+6+2+8=19 ,1+9=10,1+0=1
//result is 1 this is happy number
public class HappyNumber {
    public static int sumNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = sc.nextInt();
        boolean flag = false;
        while (true) {
            int tempSum = sumNumber(n);
            if (tempSum <= 9) {
                if (tempSum == 1) {
                    flag = true;
                    break;
                } else {
                    break;
                }
            } else {
                n = tempSum;
            }
        }
        if (flag)
            System.out.println("happy number");
        else
            System.out.println("Not a happy number");
    }
}
