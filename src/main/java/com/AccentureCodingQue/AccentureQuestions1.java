package com.AccentureCodingQue;
/*
1.Jack has an array A of length N.he wants to label whether the number in the array is even or add
your task is to help him find and return a string with the labels even or odd in sequence according to which the numbers appear in the array
//i/p->[1,2,3,4,5]
//o/p->OddEvenOddEvenOdd
 */

/*
2.Given a string and your task  is to find the count of permutation formed fixing the position of vowels present in the string
i/p->"ABC"
o/p->2

combination of consonants
BC-> bc,cd->2
factorial of 2!-> 2

i/p->CDF
o/p->6
consonants counts 3
factorial of 3! is 6
*/


public class AccentureQuestions1 {
    public static String evenOdd(int[] arr) {
        String s = " ";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                s += "Even";
            } else {
                s += "Odd";
            }
        }
        return s;
    }

    public static int factorial(int num) {
        int fact = 1;
        if (num == 0) {
            return 1;//0!->1
        } else {
            while (num != 0) {
                fact *= num;//fact=fact*num;
                num--;//num=num-1;
            }
        }
        return fact;
    }

    public static int countOfPermutation(String s) {
        if (s.isEmpty()) {//""->empty
            return 0;
        }
        int count = 0, fact = 1;
        for (int i = 0; i < s.length(); i++) {
            /*
            if (s.charAt(i) != 'a'|| s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o' || s.charAt(i) != 'u'
                    || s.charAt(i) != 'A' || s.charAt(i) != 'E' || s.charAt(i) != 'I' || s.charAt(i) != 'O' || s.charAt(i) != 'U') {

            } or
            */
            if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1) {
                count++;
            }
        }
        return factorial(count);

    }

    public static int[] reverseArray(int[] arr) {
        int swap = 0, i = 0, j = arr.length - 1;
        while (i < j) {
            swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            i++;
            j--;
        }
        return arr;
    }

    public static int addReverseArray(int[] addArray) {
        int sum = 0;
        for (int i = 0; i < addArray.length; i++) {
            if (i % 2 == 0) {
                sum += addArray[i];
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        //que1
        /*
        int arr[] = {2, 4, 5, 3, 1, 10};
        System.out.println(evenOdd(arr));
        */

        /*
        //que2
        String s = "CDFR";
        System.out.println(countOfPermutation(s));
        */

        //que3-given an array
        //find the sum of even positions after reversing the array
        //s1-reverse the array
        //s2-pick even position number and add them
        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.println(addReverseArray(reverseArray(arr)));

    }
}
