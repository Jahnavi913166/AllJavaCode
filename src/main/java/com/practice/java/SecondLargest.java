package com.practice.java;

import java.util.Scanner;
//N = 6
//Arr[] = {12, 35, 1, 10, 34, 1}
//Output: 34
public class SecondLargest {
public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static int secondLargest(int arr[],int n){
        int firstmax=-1;
        int secondmax=-1;//2 3 4 5 1
        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstmax){
                secondmax=firstmax;
                firstmax=arr[i];
            }

            else if(arr[i]>secondmax && arr[i]!=firstmax){
                secondmax=arr[i];
            }
        }
        return secondmax;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=secondLargest(arr,n);
        System.out.println("Second Largest: "+res);
    }
}
