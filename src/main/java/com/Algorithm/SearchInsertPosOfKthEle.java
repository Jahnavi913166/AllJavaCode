package com.Algorithm;

/*
Ques-Search insert position of K in a sorted array.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

*Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k,
*the task is to find the index of k, if its present in the array Arr[].
*Otherwise, find the index where k must be inserted to keep the array sorted.
N = 4
Arr = {1, 3, 5, 6}
k = 5
Output: 2

otherwise--

N = 4
Arr = {1, 3, 5, 6}
k = 2
Output: 1
*/
public class SearchInsertPosOfKthEle {
    static int searchInsertK(int Arr[], int N, int k)
    {
        int s=0,e=N-1;
        int m=0;
        boolean flag=true;
        while(s<=e){
            m=(s+e)/2;
            if(k==Arr[m]){
                flag=false;
                return m;
            }
            else if(k<Arr[m]){
                e=m-1;
            }
            else if(k>Arr[m]){
                s=m+1;
            }
            // if(Arr[m]>k && Arr[m-1]<k){
            //     return m;
            // } //this is also optimal
        }
        // If we exit the loop, s is the index where target should be inserted
        //in place of the comment statement we can also write like this
        if(flag){
            return s;
        }
        return m;

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5,7};
        int target = 6;
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (target == arr[m]) {
                System.out.println("target is found: " + m + " index"); // Exit the function since we've found the target
                break;
            } else if (target < arr[m]) {
                //search from left
                e = m - 1;
            } else if (target > arr[m]) {
                //target>arr[m]
                //search from right
                s = m + 1;
            }
//            if (arr[m] > target && arr[m - 1] < target) {
//                System.out.println(m + " is that index where is the possibility to insert the element " + target);//return position
//                break;
//            }
        }
        // If we exit the loop, s is the index where target should be inserted
         System.out.println("Target is not found. It should be inserted at index: " + s);

    }
}
