package com.TCSCodingQuestion;

import java.util.*;

/*
1  Count Distinct Element In Array
Input: arr[] = {10, 20, 20, 10, 30, 10}
Output: 3
Explanation: There are three distinct elements 10, 20, and 30.
*/

//2.Print all Distinct ( Unique ) Elements in given Array
//->printDistinctEle()

/*3.Make a distinct digit array(GFG) ques->basic level
Input: nums = [131, 11, 48]
Output: 1 3 4 8
Explanation: 1, 3, 4, and 8 are only distinct
digits that can be extracted from the numbers
of the array.
makeDistinctDigitsArray()
 */

public class CountDistinctElementInArray {
    public static int countDistinct1(int[] arr) {
        // approach 1
        Arrays.sort(arr);
        int count = 0, key = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            }
        }
        for (Integer i : map.keySet()) {
            count++;
        }
        return count;
    }

    public static int countDistinct2(int[] arr) {
        //approach 2
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int count = 0, len = arr.length;
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && arr[i] != arr[i + 1]) {
                count++;
            }
        }
        count++;//last element
        return count;
    }

    public static void printDistinctEle(int[] arr) {
        // my approach 1
        Arrays.sort(arr);
        int count = 0, len = arr.length;
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print(arr[arr.length - 1]);//last element


    }

    //Convert a String of Digits to an Integer Array
    //Character.getNumericValue(char c): Converts a character representing a digit (e.g., '1') to its corresponding integer value (1).
    public static int[] stringToIntArray(String s) {
        int intArray[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }
        return intArray;
    }


    public static void makeDistinctDigitsArray(int[] nums) {
        String s = "";
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        int[] ar = stringToIntArray(s);
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }
        System.out.println(set);
    }


    public static void main(String[] args) {
        /*
        int[] arr = {10, 20, 20, 10, 30, 10, 40, 50};
        System.out.println("Count of distinct element in array is(approach 1): " + CountDistinctElementInArray.countDistinct1(arr));
        System.out.println("Count of distinct element in array is(approach 2): " + countDistinct2(arr));

        int[] arr1 = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        printDistinctEle(arr1);
         */


        /*Input: nums = [131, 11, 48]
        Output: 1 3 4 8
       */
        //int[] nums = {131, 11, 48};
        //ap1
        int[] nums={111, 222, 333, 4444, 666};
        makeDistinctDigitsArray(nums);

        //ap2
    }


}
