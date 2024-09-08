package com.BasicJava.Operator.BasicPrograms;

//WAP to check a given char is vowel or not;
public class CheckCharVowel {
    public static void main(String[] args) {
        char ch = 'A';
        String s = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(ch) != -1) {
                System.out.println(ch + " is  a Vowel Char");
                break;
            } else {
                System.out.println(ch + " is not  a Vowel Char");
                break;
            }

        }
    }
}
