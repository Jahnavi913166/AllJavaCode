package com.BasicJava.Operator.PatternProgramming;

import java.util.Scanner;

/*
 1. * * * * * * *
      * * * * *
        * * *
          *

 2. * * * * * * *
      *       *
        *   *
          *


3.   *
     * *
     * * *
     * * * *
     * * *
     * *
     *

4.            *
            * *
          * * *
        * * * *
          * * *
            * *
              *


5. Diamond printing
         *
       * * *
     * * * * *
   * * * * * * *
     * * * * *
       * * *
         *

* */
public class StarPrinting2 {

    public static void pattern1(int lines) {
        for (int i = lines; i >= 1; i--) {
            for (int j = i; j < lines; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hallowPattern2(int lines) {
        for (int i = lines; i >= 1; i--) {
            for (int j = i; j < lines; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (i == lines || j == 1 || j == (2 * i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfDiamondPattern3(int lines) {// wrong logic
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = lines - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfDiamondPattern4(int lines) {//wrong logic
        int count = 0;//space
        int stars = 1;//star
        for (int i = 1; i <= lines; i++) {
            count = lines - i;
            for (int space = count; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars++;
        }
        count = 1;//space
        for (int i = stars - 1; i >= 1; i--) {
            for (int space = count; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            count++;//space

        }

    }

    public static void diamondPattern5(int lines) {
        int space = lines / 2, stars = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= lines / 2) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }
        }

    }

    public static void hollowDiamondPattern6(int lines) {
        int space = lines / 2, stars = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++) {
                if (k == 1 || k == stars)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            if (i <= lines / 2) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }
        }
    }

    public static void pattern7(int lines) {
        //this logic is only work for odd lines
        int stars = lines;
        int tempStar = stars / 2;
        int space = 1;
        for (int i = 1; i <= lines; i++) {
            if (i == 1 || i == lines) {
                for (int j = 1; j <= stars; j++) {
                    System.out.print("x");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= tempStar; j++) {
                    System.out.print("x");
                }
                for (int k = 1; k <= space; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= tempStar; j++) {
                    System.out.print("x");
                }
                System.out.println();
                if (i < (lines / 2) + 1) {
                    tempStar = tempStar - 1;
                    space += 2;
                } else {
                    if (i >= (lines / 2) + 1) {//6
                        tempStar = tempStar + 1;
                        space -= 2;
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int lines = sc.nextInt();
        //pattern1(lines);
        //hallowPattern2(lines);
        //halfDiamondPattern3(lines);
        //halfDiamondPattern4(lines);
        //diamondPattern5(lines);
        //hollowDiamondPattern6(lines);
        pattern7(lines);

    }
}
