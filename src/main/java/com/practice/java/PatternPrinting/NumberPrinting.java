package com.practice.java.PatternPrinting;

import java.util.Scanner;

/*1.Basic Square incrementing Pattern
           1111
           2222
           3333
           4444
*/

/*2.Internal varsity square Pattern
           333
           313
           323
           333
*/

/*
3.Basic Right Triangle Number Pattern
      1
      23
      456
      78910
*/

/*4.Basic Right Triangle Number Pattern (Inverted)
      10987
      456
      32
      1

 */

/* 5.
Basic incrementing Triangle Pattern initialised = 3
6666
555
44
3

Basic incrementing Triangle Pattern(Inverted) initialised = 3
 3
 44
 555
 6666


 */
public class NumberPrinting {
    public static void pattern1(int r, int c) {
        System.out.println("Basic Square incrementing Pattern");
        int temp = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(temp);
            }
            temp++;
            System.out.println();
        }
    }

    //not right
    public static void pattern2(int r, int c) {
        System.out.println("Internal varsity square Pattern");
        for (int i = 1; i <= r; i++) {
            int k = i;
            for (int j = 1; j <= c; j++) {
                if ((i == 1 || i == c) || (j == 1 || j == c)) {
                    System.out.print(3);
                } else {
                    System.out.print(k);
                }
            }
            System.out.println();
        }

    }

    public static void pattern3(int rows) {
        int count = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int rows) {
        System.out.println("Basic incrementing Triangle Pattern(Inverted) initialised = 3");
        int count = 3;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
            }
            count++;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();
//        System.out.println("Enter no of cols");
//        int cols = sc.nextInt();
//        pattern1(rows, cols);
//        pattern2(rows, cols);(not completed code)
//        pattern3(rows);
        pattern4(rows);
//diamond for even no of lines
//diamond and odd no of lines

    }
}
