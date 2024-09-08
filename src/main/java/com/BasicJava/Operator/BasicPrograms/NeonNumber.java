package com.BasicJava.Operator.BasicPrograms;

//eg- 9 ->square of 9 is 81 -> add 8+1=9 MATCH with original to result
//9==9 this is neon number
public class NeonNumber {
    public static void main(String[] args) {
        int n = 9;
        int sq = 81, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        if (n == sum) {
            System.out.println("Neon Number");
        } else {
            System.out.println("not a neon number");
        }
    }
}
