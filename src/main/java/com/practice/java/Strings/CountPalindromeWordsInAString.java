package com.practice.java.Strings;
//
//       Sample Input 1:
//               1
//               Nitin and I are good friends
//               Sample Output 1:
//               2
//               Explanation For Sample Input 1:
//               For the first test case,there are 2palindrome words only i.e “Nitin” and “I”.
//               Sample Input 2:
//               2
//               Madam taught us the level order traversal of a binary tree yesterday
//               We love coding ninjas
//               Sample output 2:
//               3
//               0

public class CountPalindromeWordsInAString {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        String reverseStr = str.reverse().toString();
        return s.equalsIgnoreCase(reverseStr);

    }

    public static void countNumberOfPalindromeWords(String s) {
        int count = 0;
        String arr[] = s.split(" ");
        for (String word : arr) {

            if (isPalindrome(word.toLowerCase())) {
                if(word==" "){
                    count=0;
                }
                System.out.println(word);
                count++;
                System.out.println("val:" + count);
                count = 0;
            }
        }
        //return count;

    }

    public static void main(String[] args) {
        String str = " 5 1 mom  Nitin foo";
        countNumberOfPalindromeWords(str);


    }
}
