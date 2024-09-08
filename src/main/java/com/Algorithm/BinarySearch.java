package com.Algorithm;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                //target is greater than mid(target>arr[mid])
                start = mid + 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 12, 13, 24};
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        if(binarySearch(arr, target)>-1) {
            System.out.println("Target Element is at " + binarySearch(arr, target) + " index");
        }
        else{
            System.out.println("Target is not found");
        }


    }
}
