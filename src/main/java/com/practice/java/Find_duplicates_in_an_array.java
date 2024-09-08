package com.practice.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Input: arr[] = {2,3,1,2,3}, n = 5
//        Output: 2 3
//        Explanation: 2 and 3 occur more than once in the given array.
public class Find_duplicates_in_an_array {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        for(int i=0; i<n; i++) {
            if(arr[i] / n >= 2)
                result.add(i);
        }

        if(result.size() == 0)
            result.add(-1);

        return result;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of array:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
      }
      ArrayList<Integer> res=Find_duplicates_in_an_array.duplicates(arr,n);
      for(Integer i:res){
          System.out.println(i);
      }

    }
    //    public static ArrayList<Integer> duplicates(int arr[],int n){
    //        ArrayList<Integer> result=new  ArrayList<Integer>();
    //        int count;
    //        for(int i=0;i<n;i++){
    //            count=0;
    //            if(arr[i]!=-1){
    //                for(int j=i+1;j<n;j++){
    //                    if(arr[i]==arr[j]){
    //                        count+=1;
    //                        arr[j]=-1;
    //
    //                    }
    //                   }
    //            }
    //            if(count>0){
    //                result.add(arr[i]);
    //            }
    //
    //        }
    //        if(result.size()==0){
    //            result.add(-1);
    //            return result ;
    //        }
    //       Collections.sort(result);
    //        return result;
    //    }

}
