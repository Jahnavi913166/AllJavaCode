package com.practice.java.Strings;

/*
Given a string
Input=a1b10
Output=abbbbbbbbbb
*/
public class StringQues1 {
    public static void main(String[] args) {
        String s = "a1b10";
        int n = s.length(), count = 0;
        String temp = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                temp = String.valueOf(ch);
            } else if (Character.isDigit(ch)) {
                count = ch - '0';
                while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
                    count = count * 10 + (s.charAt(++i) - '0');
                }
            }
            for (int j = 0; j < count; j++) {
                sb.append(temp);
            }
        }
        System.out.println(sb.toString());
    }
}
