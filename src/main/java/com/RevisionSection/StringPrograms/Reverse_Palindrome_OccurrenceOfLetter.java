package com.RevisionSection.StringPrograms;

public class Reverse_Palindrome_OccurrenceOfLetter {

    //W.A.P to count the no of occurrence of a given later

    //W.A.P to reverse a string
    public static StringBuilder reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        //two pointers approach
        int i = 0, j = s.length() - 1;
        char swap;
        while (i < j) {
            swap = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, swap);
            i++;
            j--;
        }
        return sb;

    }
    public static void palindrome(){

    }


    public static void main(String[] args) {

        //W.A.P to reverse a string
        String str1 = "Jaya Soni";
        System.out.println(reverse(str1));

        //W.A.P to check string is palindrome or not
        String str2="Madam";



    }
}
