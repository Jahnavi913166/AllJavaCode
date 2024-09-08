package com.practice.java;

import java.util.Scanner;

//N = 5
//Arr[] = {3, 5, 0, 0, 4}
//Output: 3 5 4 0 0
public class Move_all_zeroes_to_end_of_array {
   public static void printArray(int arr[]){
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
   }

    public static void input(Scanner scanner){
        System.out.println("enter size of array:");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        output(arr,n);
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        input(sc);

    }
    public static int[] output(int arr[],int n){
       int swap=0;
       int i=0,j=n-1;
       //3, 5, 0, 0, 4
       while(i<j){
           if(arr[i]==0 && arr[j]!=0){
               swap=arr[i];
               arr[i]=arr[j];
               arr[j]=swap;
               i++;
               j--;
           }
           if(arr[i]!=0 && arr[j]==0){
               i++;
               j--;
           }
           if(arr[i]!=0 && arr[j]!=0){
               i++;
           }
           if(arr[i]==0 && arr[j]==0){
               j--;
           }
       }
       return arr;
    }




}
