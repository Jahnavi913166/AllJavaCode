package com.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SievesOfEratosthenesAlgo_PrimeNumberInRange {
    public static boolean isPrimeNum(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();//range
        boolean[] primeArray = new boolean[n + 1];//range
        Arrays.fill(primeArray, true);//initially this have true value
        //boolean markedPrimeTrue = true;
        boolean markedFalse = false;
        for (int i = 2; i < primeArray.length; i++) {//index=2
            boolean flag = isPrimeNum(i);
            if (flag) {
                //primeArray[i] = markedPrimeTrue; if that is prime that means that is already true
                for (int j = i + 1; j < primeArray.length; j++) {
                    if (j % i == 0) {
                        primeArray[j] = markedFalse;
                    }

                }
            }
        }
        for (int i = 2; i < primeArray.length; i++) {
            if (primeArray[i]) {//true
                System.out.print(i + " ");
            }
        }

    }
}
