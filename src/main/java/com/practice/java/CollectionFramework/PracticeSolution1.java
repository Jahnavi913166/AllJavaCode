package com.practice.java.CollectionFramework;

import java.util.*;

public class PracticeSolution1 {
    public static String reverseStringA1(String str) {
        //1 approch
        char[] ch = str.toCharArray();
        Arrays.toString(ch);
        char temp = 0;
        String s = "";
        int i = 0, j = str.length() - 1;
        while (i < j) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < ch.length; k++) {
            s = s + ch[k];
        }
        return s;
    }

    public static String reverseStringA2(String str) {
        //2 approch
        if (str == null)
            throw new IllegalArgumentException("Null is not valid input");
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int j = arr.length - 1; j >= 0; j--) {
            sb.append(arr[j]);
        }
        return sb.toString();
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + " " + "b:" + b);
    }


    public static boolean stringContainsVowel1(String s) {
        boolean flag = true;
        boolean val = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'I' || ch == 'O' || ch == 'E' || ch == 'U')) {
                flag = false;
                val = true;
                break;
            }
        }
        if (flag) {
            val = false;
        }
        return val;
    }

    public static boolean stringContainsVowel2(String s) {
        //regular expression (regex) pattern.->  ".*[aeiou].*"
        //.*-> Matches zero or more of any character (except line terminators
        //The method returns true if the input string contains at least one vowel (a, e, i, o, u) and false otherwise.
        return s.toLowerCase().matches(".*[aeiou].*");
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fibonacciSeries(int n) {
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(0);
            System.out.println(1);
        } else {
            n = n - 2;
            int a = 0, b = 1, c;
            System.out.print(0 + " ");
            System.out.print(1 + " ");
            while (n != 0) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
                n -= 1;
            }
        }
    }

    public static int nthFibonacciSeries(int n) {

        if (n == 1) {
            return 0;

        } else if (n == 2) {
            return 1;
        } else {
            int a = 0, b = 1, c, count = 2;
            while (true) {
                c = a + b;
                count++;
                if (count == n) {
                    return c;
                }
                a = b;
                b = c;


            }
        }
    }

    public static int findPairs(int n, int x, int arr[]) {
        int val = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == x) {
                    //System.out.println("(" + arr[i] + "," + arr[j] + ")");
                    val = 0;
                    return 1;
                }
            }
        }
        return val;

    }

    public static int fibRecNth(int n) {
        if (n == 0||n==1) {
            return n;
        } else {
            return fibRecNth(n - 1) + fibRecNth(n - 2);
        }
    }


    public static void main(String[] args) {
        /*
        //How do you reverse a string in Java?
        String str = "abcdgr";
        String output1 = reverseStringA1(str);
        System.out.println(output1);
        String output2 = reverseStringA1(str);
        System.out.println(output2);

        //How do you swap two numbers without using a third variable in Java?
        int a = 10, b = 20;
        swap(a, b);

        //Write a Java program to check if a vowel is present in a string.
        // ascii
        //Hello -> true
        String s = "Hello";
        System.out.println(stringContainsVowel1(s));

        String s1 = "Shubham";
        //regular expression (regex) pattern.->  ".*[aeiou].*"
        System.out.println(stringContainsVowel2(s1));

         */

//----------------------------------------------------------------------------------------------------------------
        //Sorting Elements of an Array by Frequency
//        int arr1[]={5,5,4,6,4};
       /* int arr1[] = {9, 9, 9, 2, 5};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int key = 0;
        for (int i = 0; i < arr1.length; i++) {
            key = arr1[i];
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        System.out.println(map);
        //{5=2, 4=2, 6=1}
//        if(entry.getKey()<entry.getKey() && Objects.equals(entry.getValue(), entry.getValue())){
//
//        }
//        else{
//
//        }
        //key1+" "+map.get(key1)


        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }

        list.sort((a, b) -> { //comparator sorting objects
            if (b[1] != a[1]) {
                return b[1] - a[1];//compare descending order
            } else {
                return b[0] - a[0];//comparing value in descending
            }
        });

        int[] arr2 = new int[arr1.length];
        int idx = 0;
        int value = 0, freq = 0;
        for (int[] entry : list) {
            value = entry[0];//key
            freq = entry[1];//val
            for (int i = 0; i < freq; i++) {
                arr2[idx++] = value;
            }
        }

        printArray(arr2);

        //this question i will solve tomorrow

        */

//----------------------------------------------------------------------------------------------------------------------------


        //fibonacci series -> 0 1 1 2 3 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the n");
//        int n = sc.nextInt();

        //fibonacciSeries(n);

//        int nthFib = nthFibonacciSeries(n);
//        System.out.println(nthFib);


        //Find Pair Given Difference
        /*n = 6
        x = 78
        arr[] = {5, 20, 3, 2, 5, 80}
        Pair (2, 80) have absolute difference of 78.
        */

        int arr[] = {90, 70, 20, 80, 50};
        int x = 45;
        System.out.println(findPairs(arr.length, x, arr));


        //Write a Java program to print a Fibonacci sequence using recursion.
        int n = 8;
        int a = fibRecNth(n);
        System.out.println(a);

    }

}
