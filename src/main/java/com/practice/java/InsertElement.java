package com.practice.java;

import java.util.*;


//Example1 - Consider a 0-based index array. Write a program to insert an element at a given index.
//Example2 - Write a Java program to insert an element of an array at the end.
//Array Duplicates
//Write a program to remove duplicate elements from an array in Java.
public class InsertElement {
    public static void printArray(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void Example1(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter idx:");
        int idx = sc.nextInt();
        if (idx > arr.length) {
            System.out.print("Enter valid index:");
            idx = sc.nextInt();
        }
        System.out.print("Enter insertNum:");
        int insertNum = sc.nextInt();
        printArray(arr);
        int arr1[] = new int[arr.length + 1];
        int i = 0, j = 0;
        while (j < arr1.length) {
            if (i == idx) {
                arr1[j] = insertNum;
                idx = 0;
                j++;
            } else {
                arr1[j] = arr[i];
                arr[i] = 0;
                i++;
                j++;
            }
        }
        printArray(arr1);
    }

    public static void Example2(int arr[]) {
        printArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter insertNum:");
        int insertEnd = sc.nextInt();
        int array[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        array[array.length - 1] = insertEnd;
        printArray(array);
    }

    public static void Example3(int array[]) {
        printArray(array);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter idx:");
        int idx = sc.nextInt();
        if (idx > array.length) {
            System.out.print("Enter valid index:");
            idx = sc.nextInt();
        }
        System.out.print("Enter insertNum:");
        int insertNum = sc.nextInt();
        int i = 0, j = array.length - 2;
        while (i < j) {
            if (i == idx) {
                while (i != j) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[i] = insertNum;
            }
            i++;
        }
        printArray(array);

    }

    public static void Example4RemoveEle(int array[]) {
        //RemoveArray
        printArray(array);
        Scanner sc = new Scanner(System.in);
        int removeIdx = sc.nextInt();
        int i = 0, j = 0;
        while (i < array.length) {
            if (i == removeIdx) {
                array[i] = 0;
                j++;
                while (j < array.length) {
                    array[i] = array[j];
                    array[j] = 0;
                    i++;
                    j++;
                }
                break;
            }
            i++;
            j++;

        }
        printArray(array);

    }

    public static void duplicateArrayON2(int arr1[]) {
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) { //TC-> O(n2)
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j] && arr1[i] > -1 && arr1[j] > -1) {
                    arr2.add(arr1[i]);
                    arr1[i] = -1;
                    arr1[j] = -1;
                    flag = false;
                    break;
                }

            }
        }
        if (flag) {
            arr2.add(-1);
        }

        System.out.println(arr2);
    }

    public static void evenIdxOddIdx(int arr[]) {
        int i = 0, j = i + 1;
        int swap = 0;
        while (i < arr.length - 1) {
            if ((i % 2 == 0 && arr[i] % 2 != 0) && (j % 2 != 0 && arr[j] % 2 == 0)) {
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                if (j < arr.length - 1) {
                    i++;
                    j++;
                }


            } else if (((i % 2 != 0 && arr[i] % 2 != 0) && (j % 2 == 0 && arr[j] % 2 == 0)) || ((i % 2 != 0 && arr[i] % 2 != 0) && (j % 2 == 0 && arr[j] % 2 != 0)) ||
                    ((i % 2 == 0 && arr[i] % 2 == 0) && (j % 2 != 0 && arr[j] % 2 != 0))) {

                if (j < arr.length) {
                    i++;
                    j++;
                }
            }
        }
        printArray(arr);
    }

    public static void removeDuplicateFromString1(String s) {
        Set<Character> set1 = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            set1.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set1) {
            sb.append(c);
        }
//        String str=sb.toString();
        System.out.println(sb);
    }

    public static void removeDuplicateFromArrays(int arr1[]) {
        int arr2[] = new int[arr1.length];
        int i = 0, j = 0;
        while (i < arr1.length - 1) {
            if (arr1[i] != arr1[i + 1]) {
                arr2[j] = arr1[i];
                i++;
                j++;
            } else if (arr1[i] == arr1[i + 1]) {
                i++;
            }
        }

        arr2[j] = arr1[i];
        for(int k=0;k<=j;k++){
            System.out.print(arr2[k]+"\t");
        }
    }
    public static String removeDuplicateFromString2(String str){
        if(str.length()==0){
            return str;
        }
        String s="";
         StringBuilder sb=new StringBuilder(str);
         int i=0;
         while(i<sb.length()){

               char ch1=sb.charAt(i);
               char ch2=sb.charAt(i+1);
               if(ch1!=ch2){
                  s=s+ch1;
               }
               if(ch1==ch2){
                   i++;
                   continue;
               }
               i++;

          }
         s=s+sb.charAt(sb.length()-1);
         return s;
    }


    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 0, 0};//extra space
        //Example1(arr);

        //Measure
        // the time taken by Example2 function
//        long startTime = System.nanoTime();
//        // Call the Example2 function
//        Example2(arr);
//        long endTime = System.nanoTime();
//        // Calculate the duration in seconds
//        long duration = (endTime - startTime) / 1000000000; // duration in seconds
//        System.out.println("Time taken: " + duration + " seconds");
        //Example3(arr);

//        int arr[] = {1, 2, 3, 4, 5};
//        Example4RemoveEle(arr);

        //int arr1[] = {0,3,1,2};
        // duplicateArrayON2(arr1);
//        duplicateArrayON(arr1);      0  1  2  3  4  5
//        int arr[] = {8,5 ,3 ,2, 1 ,9, 6 ,4};//3, 6, 12, 1, 5, 8
//        printArray(arr);
//        long startTime = System.nanoTime();
//        evenIdxOddIdx(arr);
//        long endTime = System.nanoTime();
//        // Calculate the duration in seconds
//        long duration = (endTime - startTime) / 1000000000; // duration in seconds
//        System.out.println("Time taken: " + duration + " seconds");


//        Set<Integer> set=new HashSet<>();
//        for(int val:arr){
//            set.add(val);
//        }
//        System.out.println(set);
//        String s="gfg";
//        removeDuplicateFromString1(s);


        // Write a program to remove duplicate elements from an array in Java.
//        int[] arr = {0, 0, 1, 1, 1, 2, 3,};
//        System.out.println("duplicates");
//        printArray(arr);
//        System.out.println("Removed duplicates");
//        removeDuplicateFromArrays(arr);

        // Write a program to remove duplicate elements from an string in Java.
        String s="gfg";
        String str=removeDuplicateFromString2(s);
        System.out.println(str);



//        Write a program to find the maximum sum subarray in an array in Java.
//        Write a program to find the first non-repeating character in a string in Java.


    }


}






