package com.TCSCodingQuestion;
//TCS coding Question

import java.util.Scanner;

//prime no,perfect sq,remaining is sum of previous two term
public class SeriesQuestion {
    public static boolean isPrimeNo(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectSq(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a position");
        int position = scn.nextInt();//6
        int powerOfTwo = 1;// 2 power 0 -> 1
        int powerOfThree = 1;// 3 power 0 -> 1
        int[] arr = new int[position]; //6->0,1,2,3,4,5;
        for (int i = 0; i <= position - 1; i++) {
            if (isPrimeNo(i + 1)) {
                arr[i] = powerOfTwo;
                powerOfTwo *= 2;
            } else if (isPerfectSq(i + 1)) {
                arr[i] = powerOfThree;
                powerOfThree *= 3;
            } else {
                //remaining position(previous two term sum)
                int sum = 0;
                sum += arr[i - 1] + arr[i - 2];
                arr[i] = sum;
            }

        }
        printArray(arr);
    }


}
