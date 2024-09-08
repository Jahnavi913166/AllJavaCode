package com.Algorithm;

import java.util.ArrayList;

public class TwoRepeatedElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arrayList.add(arr[i]);
                    arr[i]=-1;
                    break;
                }
            }

        }
        System.out.println(arrayList);
    }
}