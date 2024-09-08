package com.AccentureCodingQue;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5};
        int currSum=arr[0],maxSum=arr[0];
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                currSum=currSum+arr[j];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }

        }
        System.out.println(maxSum);
    }
}
