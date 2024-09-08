package com.practice.java;
//N = 4, K = 6
//arr[] = {1, 5, 7, 1}
public class CountPairsWthGivenSum {
    public static void main(String[] args) {
       int arr[] = {1, 5, 7, 1,5};
       int K=6,count=0;
//nested loop O(n2)TC
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==K){
                   count++;
               }
           }
       }
        System.out.println(count);
// without nested loop O(n)TC
    


    }
}
