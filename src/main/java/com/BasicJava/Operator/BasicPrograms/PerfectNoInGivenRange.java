package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

public class PerfectNoInGivenRange {
    public static void PerfectNo(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for (int i = 1; i <= range; i++) {
            PerfectNo(i);
        }

    }
}
