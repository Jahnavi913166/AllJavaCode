package com.RevisionSection.StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctLetter_Character {
    public static void distinctWord(String s) {
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            boolean result = findDistinctWord(strArray[i]);
            if (result) {//if true
                System.out.println(strArray[i]);
            }
        }
    }

    public static boolean findDistinctWord(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Character key;
        for (int i = 0; i < s.length(); i++) {
            key = s.charAt(i);
//            if (map.containsKey(key)) {
//                map.put(key, map.get(key) + 1);
//            } else {
//                map.put(key, 1);
//            } or
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (Integer i : map.values()) {
            System.out.println(i);
        }
        for (Integer i : map.values()) {
            if (i > 1) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder findDistinctCharacter(char[] ch) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Character key;
        for (int i = 0; i < ch.length; i++) {
            key = ch[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        StringBuilder s = new StringBuilder();
        for (Map.Entry<Character, Integer> ele : map.entrySet()) {
            if (ele.getValue() == 1) {
                s.append(ele.getKey());
            }
        }
        return s;

    }

    public static void distinctCharacter(String s) {

        String[] stArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String res : stArray) {
            sb.append(res);
        }
        char[] chArray = sb.toString().toCharArray();
        sb = findDistinctCharacter(chArray);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        //W.A.P to print distinct letter/word in string
        //The distinct characters should be printed in same order as they appear in input string.
        String s = "Geeks for Geeks";
        //  distinctWord(s);

        //W.A.P to print distinct character in string
        //Input  : Hello Geeks
        //Output : HoGks
        //String s1 = "Hello Geeks";
        String s1 = "Geeks for Geeks";
        distinctCharacter(s1);





        //W.A.P to reverse a string
        //W.A.P to check string is palindrome or not
        //W.A.P to display only digits only in a alfa numeric string
        //W.A.P to count the no of occurrence of a given later
        //W.A.P to convert lower case letter into uppercase and uppercase into lowercase
        //W.A.P to check string is anagram or not

    }

}
