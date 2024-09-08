package com.Algorithm;

//Find start and ending index of an element in an unsorted array
public class start_endIndex {
    static int[] findIndex(int arr[], int key){
        int newArray[]=new int[2];
        int start=-1,end=-1;
        for(int i=0;i<arr.length;i++){
            if(key!=arr[i])
            {
                continue;
            }
            if(start==-1)
            {
                start=i;
            }
            end=i;
        }
        if(start!=-1){
            if(start==end || start!=-1){
                newArray[0]=start;
                newArray[1]=end;

            }
        }
        else{
            newArray[0]=-1;
            newArray[1]=-1;
        }
        return newArray;

    }
    public static void main(String[] args) {
        //int arr[] = {1, 2, 3, 4, 5, 5}, key = 5;
        // int arr[] = {1, 3, 7, 8, 6},key=2;
        int arr[] = {1, 8, 7, 8, 6}, key = 7;
        int start = -1, end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (key != arr[i]) {
                continue;
            }
            if (start == -1) {
                start = i;
            }
            end = i;
        }
        if (start != -1) {
            if (start == end) {
                System.out.println("Only one occurrence of key is present at index: " + start);
            } else {
                System.out.println("Start index: " + start);
                System.out.println("End index: " + end);
            }
        } else {
            System.out.println("key are not present in the array");
        }
    }
}
