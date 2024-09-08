package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

//WAJP to print the primeNum in a given range
//WAJP to print the smallest primeNum in a given range
//WAJP to print the larger primeNum in a given range
//WAJP to print the second highest printNum in a given range
//WAJP to print the second smallest printNum in a given range
public class PrintPrimeNoInGivenRange {
    public static boolean isPrimeNum(int num) {
        //if that num is divisible by 1 and itself it is prime number
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;// If divisible, it's not a prime number
            }
        }
        return true;// If not divisible by any number, it's prime
    }

    public static void smallestPrimeNo(int range) {
        for (int i = 1; i <= range; i++) {
            boolean flag = isPrimeNum(i);
            if (flag) {
                System.out.println("smallestPrimeNo:" + i);
                break;
            }
        }
    }

    public static void HighestPrimeNo(int range) {
        for (int i = range; i >= 1; i--) {
            boolean flag = isPrimeNum(i);
            if (flag) {
                System.out.println("HighestPrimeNo:" + i);
                break;
            }
        }
    }

    public static void secondSmallestPrimeNo(int range) {
        int primeCount = 0;
        for (int i = 1; i <= range; i++) {
            boolean flag = isPrimeNum(i);
            if (flag) {
                primeCount++;
                System.out.println(primeCount);
                if (primeCount == 2) {
                    System.out.println("secondSmallestPrimeNo:" + i);
                    break;
                }
            }
        }
    }

    public static void secondHighestPrimeNo(int range) {
        int primeCount = 0;
        for (int i = range; i >= 1; i--) {
            boolean flag = isPrimeNum(i);
            if (flag) {
                primeCount++;
                System.out.println(primeCount);
                if (primeCount == 2) {
                    System.out.println("secondHighestPrimeNo:" + i);
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int r = sc.nextInt();
        //WAJP to print the primeNum in a given range
//        for (int i = 1; i <= r; i++) {
//            boolean flag = isPrimeNum(i);
//            if (flag) System.out.print(i + " ");
//        }

        //WAJP to print the smallest primeNum in a given range
        // smallestPrimeNo(r);

        //WAJP to print the larger primeNum in a given range
        // HighestPrimeNo(r);

        //WAJP to print the second highest printNum in a given range
        secondSmallestPrimeNo(r);

        //WAJP to print the second smallest printNum in a given range
        secondHighestPrimeNo(r);

    }
}
