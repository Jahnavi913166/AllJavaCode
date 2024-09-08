package com.Algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOccOnlyOnce {
    public static int approach1(int[] arr) {
        //using hashmap
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int key = 0;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if (ele.getValue() == 1) {
                return ele.getKey();
            }
        }
        return -1;
    }

    public static int approach2(int[] arr) {
        //using XOR
        //2^2^5^5^20^30^30=20 ans
        int xor = arr[0], n = arr.length - 1;
        for (int i = 1; i <= n; i++) {
            xor ^= arr[i];//xor=xor^arr[i]
        }
        return xor;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 5, 5};
        //System.out.println("Element Occurrence only once: " + approach1(arr));
        System.out.println("Element Occurrence only once: " + approach2(arr));


    }
}
