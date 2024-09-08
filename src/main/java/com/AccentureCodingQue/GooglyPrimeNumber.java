package com.AccentureCodingQue;

/* A googly prime number is defined as a number that is derived from the sun of its individual digits
for eg=43 -> 4+3->7
to find whether the current number is google prime number or not
input-43
output=yes
input-1235
output=yes
*/

public class GooglyPrimeNumber {
    public static boolean primeNo(int n) {
        int sum = 0, rev = 0;
        while (n > 0) {
            rev = n % 10;
            sum += rev;
            n = n / 10;
        }
        System.out.println(sum);
        for (int i = 2; i < Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int n = 123;
        System.out.println(primeNo(n));

    }
}
