package com.AccentureCodingQue;

import java.util.Stack;

//Given an array f size n ,print the next greater element  of every element
/*
the next greater element for an element x is the first greater element  on the right side of x  in the array.element for which no greater element
exists,consider the next greater element as -1
Input- 5  7 1 7 6 0
Output-7 -1 7 -1 -1 -1
array size for input and output will be same
*/
public class nextGreaterElement {

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void nextGreater(int[] array) {
        int i, j, n = array.length, next;
        int newArray[] = new int[n];
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    next = array[j];
                    break;
                }
            }
            newArray[i] = next;

        }
        printArray(newArray);
    }


    public static void main(String[] args) {
        int[] array = {1, 5, 3, 4, 2};
        nextGreater(array);
        //stack based


    }
}
