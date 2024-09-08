package com.practice.java.Strings;

/*Write a program to print the following output for the given input. You can assume the string is of odd length
Input: 12345
        Output:
        1       5
          2   4
            3
          2  4
        1       5

 */
public class StringQues2_Zoho {
    public static void main(String[] args) {
        String s = "12345";
        int row = s.length(), col = row;
        //two pointer approach
//        int i=1;
//        int j=s.length();
//        for(i)
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (i == 0 || j == s.length() - 1) {
                System.out.print(s.charAt(i));
            } else {
                System.out.print(" ");
                i++;
            }
        }

    }
}
