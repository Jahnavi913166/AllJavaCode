package com.Algorithm;

import java.util.Arrays;

//Given a sorted array arr and a value x, return an array of size 2. The first value is the number of elements less than or equal to x, and the second value is the number of elements greater than or equal to x.
//Input: arr[] = [1, 2, 8, 10, 11, 12, 19],  x = 0
//Output: 0, 7->numbers count |  0 is less ->count or 0 is greater count
public class SmallerAndLarge {

    static int[] getMoreAndLess(int[] arr, int x) {
        //return an array of size 2.
        //1, 5, 8, 10, 11, 12, 19
        int[] newArray = new int[2];
        int smallNumCount = 0, largeNumCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                smallNumCount++;
            }
            if(arr[i]>=x){
                largeNumCount++;
            }
        }
        newArray[0]=smallNumCount;
        newArray[1]=largeNumCount;
        return newArray;
    }


    public static void main(String[] args) {
        //int arr[] = {1, 2, 8, 10, 11, 12, 19}, x = 0;
        int arr[] = {1, 5, 8, 10, 11, 12, 19}, x = 5;

        System.out.println(Arrays.toString(getMoreAndLess(arr, x)));


    }
}
