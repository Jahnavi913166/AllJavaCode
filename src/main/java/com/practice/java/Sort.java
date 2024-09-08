package com.practice.java;

import com.RevisionSection.AccessModifier1;
import com.RevisionSection.AccessModifier2;

public class Sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void swap(int arr[], int a1, int a2) {
        int swapIn = arr[a1];
        arr[a1] = arr[a2];
        arr[a2] = swapIn;

    }

    public static void sortArray(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
        printArray(arr);

    }


    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 0, 2, 2, 1, 2, 2};
        printArray(arr);
        System.out.println();
        sortArray(arr);

        System.out.println();
        //for different package if it is public we can access it anywhere inside the package or outside the package
        AccessModifier1.funcAccessModifier1();
        //if the function is not public so we can't access it outside the package
//        AccessModifier2.funcAccessModifier2();

        AccessModifier1 a = new AccessModifier1();
        //System.out.println(a.access);//here i am not able to access the access variable outside the package because this variable is not public
        System.out.println(a.access);//now i can access this var from outside the package because this var is public so i can access it anywhere
        AccessModifier1.getA();


    }

}
