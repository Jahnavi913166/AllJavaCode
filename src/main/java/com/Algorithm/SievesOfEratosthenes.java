package com.Algorithm;

import java.util.Arrays;

//Sum of all Primes in a given range using Sieve of Eratosthenes
public class SievesOfEratosthenes {
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

    void sievesOfEratosthenes(int n) {
        boolean[] array = new boolean[n + 1];
        Arrays.fill(array, true);
        for (int p = 2; p * p <= n; p++) {//range
            if (isPrimeNum(p)) {
                for (int i = p * p; i <= n; i += p) {//i=2*p;i<=n;i+=p
                    array[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (array[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    static void sumOfPrimeNo_usingSieves(int s, int e) {
    }


    public static void main(String[] args) {
        int n = 20;//range
        SievesOfEratosthenes s = new SievesOfEratosthenes();
        s.sievesOfEratosthenes(n);
        int startRange = 5;
        int endRange = 20;
        sumOfPrimeNo_usingSieves(startRange, endRange);
    }
}
