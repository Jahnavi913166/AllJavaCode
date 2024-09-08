package com.Algorithm;

//Find first and last positions of an element in a sorted array(based on binary search)
public class First_LastOccurrence_BS {
    public static void firstLastOc(int[] arr, int target) {
        int firstOcc = 0, lastOcc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                if (arr[i] == arr[i + 1] && arr[i] != arr[i - 1]) {
                    firstOcc = i;
                } else if (arr[i] != arr[i + 1] && arr[i] == arr[i - 1]) {
                    lastOcc = i;
                } else if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                    firstOcc = i;
                    lastOcc = i;
                }
            }
        }
        System.out.println("firstOccurrence: " + firstOcc);
        System.out.println("lastOccurrence: " + lastOcc);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125}, target = 7;
        //firstLastOc(arr, target);

        //approach2
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target != arr[i]) {
                continue;
            }
            if (first == -1) {
                first = i;
            }
            last = i;

        }
        if (first != 1) {
            System.out.println("firstOccurrence: " + first);
            System.out.println("lastOccurrence: " + last);
        }

    }
}
