package com.BasicJava.Operator.BasicPrograms;
// A no which is divisible by one and num itself it is called a prime no
import java.util.Scanner;
//TC= o(nx root n)
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Not a prime no");
        } else {
            boolean flag = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("Prime no");
            else System.out.println("not Prime no");
        }
    }
}
