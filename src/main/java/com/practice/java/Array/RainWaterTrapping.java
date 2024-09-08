package com.practice.java.Array;

public class RainWaterTrapping {
    public static void printArray(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            System.out.print(givenArray[i] + " ");
        }
        System.out.println();
    }

    public static int[] maxCalcleft(int[] mainArray, int[] left) {
        int n = mainArray.length;
        int maxLeft = mainArray[0], i = 1, j = 0;
        left[j++] = maxLeft;
        while (i < n) {
            if (mainArray[i] > maxLeft) {
                maxLeft = mainArray[i];
            }
            i++;
            left[j++] = maxLeft;
        }


        return left;
    }

    public static int[] maxCalcright(int[] mainArray, int[] right) {
        int n = mainArray.length;
        int maxRight = mainArray[n - 1], i = n - 2, j = n - 1;
        right[j--] = maxRight;
        while (i >= 0) {
            if (mainArray[i] > maxRight) {
                maxRight = mainArray[i];
            }
            i--;
            right[j--] = maxRight;

        }
        return right;
    }

    public static int rainWater(int[] arr) {
        int len = arr.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = arr[0];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
        right[len - 1] = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int ans=0;
        for (int i = 0; i < len; i++) {
            ans += (Math.min(left[i], right[i]) - arr[i]);  ;
        }
        return ans;

    }

    public static void main(String[] args) {
        //3, 1, 2, 4, 0, 1, 3, 2
        int[] arr = {2, 3, 5, 6, 0, 1, 2, 3};//height of building
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left = maxCalcleft(arr, left);
        right = maxCalcright(arr, right);
        int sum = 0, min;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(left[i], right[i]) - arr[i];
            sum += min;
        }
        System.out.println("total no of block water contained:" + sum);
        System.out.println(rainWater(arr));

    }
}
