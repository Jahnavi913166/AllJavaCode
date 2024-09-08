package com.practice.java.CollectionFramework;

//Given a ArrayList of N elements and a integer Q defining the type of query(which will be either 1 or 2) :
//  Q = 1 includes two integers p and r. Which means insert the value r at index p in the ArrayList
//  and print the whole updated ArrayList.
//  Q = 2 includes one integer p. In this query print the index at which the value p is last found in the ArrayList.
//  If the value p is not found in the ArrayList then print "-1"
/*
Input:
        N = 5, Q = 1
        A[] = {1, 4, 5, 9, 3}
        Query[] = {2, 6}
        Output:
        1 4 6 5 9 3
Input:
       N = 4 , Q = 2
       A[]= {1, 9, 2, 4}
       Query[]= {4}
       Output:
       3

 */

import javax.management.Query;
import java.util.ArrayList;

public class PracticeSolution2 {
    public static ArrayList<Integer> function(int N, ArrayList<Integer> arr, int Q, ArrayList<Integer> query) {
        int j = 0, idx, val;
        boolean flag = true;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (Q == 1) {
                idx = query.get(j);
                val = query.get(j + 1);
                if (i == idx) {
                    arr.add(idx, val);
                    break;
                }
            } else if (Q == 2) {
                val = query.get(j);
                arr1.add(arr.lastIndexOf(val));
                return arr1;

            }
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //case1
/*
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(4);
        A.add(5);
        A.add(9);
        A.add(3);
        System.out.println(A);
        ArrayList<Integer> query = new ArrayList<>();
        query.add(2);
        query.add(6);//2 index,put=6
        System.out.println(query);
        int N = A.size(), Q = 1;//here Q denotes query  (either 1st and 2nd)
        System.out.println(function(N,A,Q,query));


        //case 2
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(9);
        A.add(2);
        A.add(4);
        A.add(816);
        A.add(3);
        A.add(816);
        System.out.println(A);
        ArrayList<Integer> query = new ArrayList<>();
        query.add(816);
        int N = A.size(), Q = 2;//here Q denotes query  (either 1st and 2nd)
        System.out.println(function(N, A, Q, query));

 */


        //Common Elements
        /*
        n = 5
        v1[] = {3, 4, 2, 2, 4}
        m = 4
        v2[] = {3, 2, 2, 7}
        Output:
        2 2 3
        */
        int[] v1 = {3, 4, 2, 2, 4};
        int[] v2 = {3, 2, 2, 7};
        int n, m, k = 0, i = 0, j = 0;
        n = v1.length;
        m = v2.length;
        int[] newArray = new int[v1.length];
        while ((i < n && i != v1.length) || j <= m && j!=v2.length) {
            if (v1[i] > -1 && v2[i] > -1) {
                if (v1[i] == v2[j]) {
                    newArray[k++] = v1[i];
                    v2[j] = -1;
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
        }
        printArray(newArray);

    }

}
