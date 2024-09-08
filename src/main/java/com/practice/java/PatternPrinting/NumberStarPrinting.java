package com.practice.java.PatternPrinting;

import java.util.Scanner;

/*1.Basic incrementing Squared Number-Star Pattern
https://prepinsta.com/pattern-programs-tutorial/
           1*2*3*4
           5*6*7*8
           9*10*11*12
           13*14*15*16
*/

/*2.Basic incrementing inverted Squared Number-Star Pattern
           13*14*15*16
           9*10*11*12
           5*6*7*8
           1*2*3*4
*/
public class NumberStarPrinting {
    public static void incrementSquaredNum(int r, int c) {
        int temp = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(temp++);
                if (c != j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void invertedSquaredNum(int r, int c) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no of cols");
        int cols = sc.nextInt();
        incrementSquaredNum(rows, cols);
    }
}
