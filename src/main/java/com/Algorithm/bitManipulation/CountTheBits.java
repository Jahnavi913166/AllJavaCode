package com.Algorithm.bitManipulation;

/*
Input: n = 6
Output: 2
Explanation: Binary representation is '110', so the count of the set bit is 2.
*/
public class CountTheBits {
    public static void countBits() {
        int n = 10, newNum = n;
        int binary = 0, i = 1;
        while (n > 0) {
            int bit = n % 2;
            binary = bit * i + binary;
            i *= 10;
            n /= 2;
        }
        System.out.println(binary);
        int count = 0;
        while (newNum > 0) {
            int bit = binary % 10;
            if (bit == 1) {
                count++;
            }
            binary /= 10;
            newNum = newNum >> 1;
        }
        System.out.println(count);

    }


    public static void main(String[] args) {
        //this code will give to correct result is the range is smaller than n = 100018467 no
        countBits();

        //now longer number use string
        int n = 100018467, count = 0;
        String binary = "";
        while (n > 0) {
            int bit = n % 2;
            if (bit == 1) {
                count++;
            }
            n /= 2;
            binary = bit + binary;
        }
        System.out.println(binary);
        System.out.println(count);
    }
}
