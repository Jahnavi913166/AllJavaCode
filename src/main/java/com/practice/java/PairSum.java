package com.practice.java;

import java.util.*;

/*
n=5
pair sum=5
1 2 3 4 5
Sample Output 1:
1 4
2 3
Explanation For Sample Output 1:
Here, 1 + 4 = 5
      2 + 3 = 5
Hence the output will be, (1,4) , (2,3).
Note:
Each pair should be sorted i.e the first value should be less than or equals to the second value.
*/
public class PairSum {
    public static List<int[]> pairSum(int[] arr, int s) {
        int n = arr.length;
        List<int[]> l = new ArrayList<>();
        int[] pair ;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == s) {
                    pair = new int[2];
                    if (arr[i] <= arr[j]) {
                        pair[0] = arr[i];
                        pair[1] = arr[j];
                    } else {
                        pair[0] = arr[j];
                        pair[1] = arr[i];
                    }

                    l.add(pair);
                }

            }
        }
Collections.sort(l, new Comparator<int[]>() {
    @Override
    public int compare(int[] o1, int[] o2) {
        if(o1[0]!=o2[0]){
            //return Integer.compare(o1[0], o2[0]);
            int result ;
           if(o1[0]>o2[0])
               result=1;
           else if(o1[0]<o2[0])
               result=-1;
           else
               result=0;
            return result;
        }
        else{
            //return Integer.compare(o1[1], o2[1]);
            int result;
            if(o1[1]>o2[1])
                result=1;
            else if(o1[1]<o2[1])
                result=-1;
            else
                result=0;
            return result;
        }
    }
});

        return l;
    }

    public static void main(String[] args) {
        //5 0
        //2 -3 3 3 -2
        /*int[] arr = {1, 2, 3, 4, 5};
        int Sum = 5;
        */
        int[] arr = {2, -3, 3, 3, -2};
        int Sum = 0;
        List<int[]> l = pairSum(arr, Sum);
        for (int[] array : l) {

            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
