package com.practice.java.Array;

public class BinarySearchVariant {
    //First occurrence of key (index of array). This is similar to
    public static void firstOccurrenceOfBS(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == target) {
                System.out.println("index: " + m);
                break;
            } else if (target < arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
    }

    //: Last occurrence of key (index of array)
    public static void lastOccurrenceOfBS(int[] arr, int target) {
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target != arr[i]) {
                continue;
            }
            last = i;
        }
        System.out.println("lastOccurrence:" + last);
    }

    public static void main(String[] args) {
        // int[] arr = {2, 3, 3, 5, 5, 5, 6, 6};
        // firstOccurrenceOfBS(arr, 3);
        //  lastOccurrenceOfBS(arr, 5);
        int count = 0;
        String s = "madam oyo";
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {

        }
    }}
