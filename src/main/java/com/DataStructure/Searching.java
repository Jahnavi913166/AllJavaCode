package com.DataStructure;

public class Searching {
    //linear search
    //binary search
    public static int linearSearch(int[] arr, int search) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == search) {
                return mid;
            }
            if (arr[mid] < search) {
                start = mid + 1;
            }
            if (arr[mid] > search) {
                end = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        /*int[] arr = {10, 2, 23, 34, 100, 56, 79, 90};
        int ele = linearSearch(arr, 79);
        if (ele != -1) {
            System.out.println("Element is found at " + ele + " index");
        } else {
            System.out.println("Element is not found");
        }

         */
        int[] arr={10,34,45,56,78,89,90,100};
        int ele = binarySearch(arr, 100);
        if (ele != -1) {
            System.out.println("Element is found at " + ele + " index");
        } else {
            System.out.println("Element is not found "+ele);
        }
    }
}
