package com.practice.java;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCount {
    public static void freqPrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void freqCount(int arr[]) {
        int key = 0, freq;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            freq = 1;
            if (arr[i] > -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    key = arr[i];
                    if (arr[i] == arr[j]) {
                        arr[j] = -1;
                        ++freq;


                    }
                }
            }
            map.put(key, freq);
        }
        System.out.println(map);
    }

    public static void freqCountMap(int arr[]) {
        Map<Integer, Integer> map = new TreeMap<>();
        int key = 0;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 5, 2, 1};
        freqCount(arr);
        freqCountMap(arr);



    }
}
