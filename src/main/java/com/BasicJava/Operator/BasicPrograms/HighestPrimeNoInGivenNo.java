package com.BasicJava.Operator.BasicPrograms;

//I/p->9723
//o/p->7
public class HighestPrimeNoInGivenNo {
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

    public static void main(String[] args) {
        int n = 9723;//check this for single digits
        int maxPrime = n % 10;//initial max=3
        while (n > 0) {
            int currNum = n % 10;
            boolean flag = isPrimeNum(currNum);
            if (flag)
                if (currNum > maxPrime) {
                    maxPrime = currNum;
                }
            n /= 10;
        }
        System.out.println(maxPrime);

    }
}
