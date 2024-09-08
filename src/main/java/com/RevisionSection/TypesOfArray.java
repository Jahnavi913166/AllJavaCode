package com.RevisionSection;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class TypesOfArray {
    //3 types
// 1.normal array,
// 2.two array
// 3.jagged array
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
    }

    public static void normalArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
    }

    public static void twoDArray(int[][] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {//rows
            for (int j = 0; j < arr[i].length; j++)//col
            {
                arr[i][j] = sc.nextInt();
            }
        }
        print2DArray(arr);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        // 1.normal array,
        //int arr[]={1,2,3,4};
        /*int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        normalArray(arr, sc);
         */

        // 2.two array-> array of arrays
        //int[] [] array={{1,2,3},{3,4,5},{5,6,7}};
        /*
        int[][] array = new int[3][4];//int[rows][cols]
        twoDArray(array, sc);
        */


        //3.Jagged Array
        // A jagged array in Java is an array where each row can have a different number of elements
        // eg-Matrix Representation with Varying Row Sizes:
        //When representing matrices or tables where different rows have different numbers of columns.

        //int [][] jaggedArray={{1,2,3},{3,4}};//jaggedArray
        //System.out.println(Arrays.toString(jaggedArray[1]));

        //user defined
        Scanner sc = new Scanner(System.in);
        int[][] jaggedArray = new int[3][];//row define
        jaggedArray[0] = new int[4];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];

        System.out.println("Enter the array of arrays");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Enter the " + jaggedArray[i].length + " values for " + (i + 1) + " rows");
            System.out.println();
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }

    }
}
