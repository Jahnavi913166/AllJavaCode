package com.practice.java.Strings;

public class PalindromeString {
    public static void main(String[] args) {
        //two pointers approach
        String str = "abcdcba";
        int start = 0;
        int end = str.length() - 1;
        boolean flag = false;
        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                flag = true;
            }
            start++;
            end--;
        }
        if (flag) System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }
}
