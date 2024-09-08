package com.training.CollectionAPI;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class ArraysClass {
    public static void printArray(Integer arr[]) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //arrays class work in both datatype primitive or non-primitive
       /*
        int [] num={2,3,4,5,6,7,89,90};

        //i want to perform binarysearch(it works in sorted data)
        int idx= Arrays.binarySearch(num,4);
        System.out.println("The index of 4 in a array is:"+idx);
       */

        Integer arr[] = {1, 23, 34, 3, 20, 123};
        System.out.println("before sorting");
        printArray(arr);
        //to sort the element
        Arrays.sort(arr);//it internally perform quick sort
        System.out.println("After sorting");
        printArray(arr);


        //to fill the same values in array in all index
        Arrays.fill(arr, 12);
        printArray(arr);


    }
}
