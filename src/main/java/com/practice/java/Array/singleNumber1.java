package com.practice.java.Array;

public class singleNumber1 {
    public static void main(String[] args) {
        int num[] = {2, 2, 1};
        int ans = num[0];
        for (int i = 1; i < num.length; i++) {
            ans = ans ^ num[i];
        }
        System.out.println(ans);
    }
}

