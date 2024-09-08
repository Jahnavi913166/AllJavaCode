package com.BasicJava.Operator.PatternProgramming;

import java.util.Scanner;

/*
1.Pattern(right angle)
 *
 * *
 * * *
 * * * *

2.Pattern(reverse right angle)
 * * * *
 * * *
 * *
 *

3.Pattern
*****
*   *
*   *
*   *
*****

4.Pattern
*       *
  *   *
    *
  *   *
*      *

*/
public class StarPrinting1 {
    public static void rightAnglePattern1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void reverseRightAnglePattern2(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern3(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || j == 1 || i == size || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern4(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || j == size + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void pattern5(int rows) {
//        way1
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //way2
        int space = rows - 1;
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            space--;
            stars++;
            System.out.println();
        }

    }

    public static void pattern6(int size) {
        int space = size - 1;
        int stars = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == stars || j == 1 || i == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            space--;
            stars++;
        }
    }

    public static void pattern7(int rows) {
        System.out.println("Pyramid star pattern");
//        int count = 0, starNum = 1;
//        for (int i = 1; i <= rows; i++) {
//            count = rows - i;
//            for (int space = count; space >= 0; space--) {
//                System.out.print(" ");
//            }
//            for (int star = 1; star <= starNum; star++) {
//                System.out.print("*");
//            }
//            starNum += 2;
//            System.out.println();
//        }


        //2 way
        int space = rows - 1;
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            stars += 2;
        }
    }

    public static void hallowPattern8(int rows) {
        int space = rows - 1;
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            space--;
            stars += 2;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size:");
        int size = sc.nextInt();
//        System.out.println("rightAnglePattern1");
//        rightAnglePattern1(size);
//        System.out.println("reverseRightAnglePattern2");
//        reverseRightAnglePattern2(size);
//        System.out.println("Pattern 3");
//        Pattern3(size);
//        System.out.println("Pattern 4");
//        Pattern4(size);
//        pattern5(size);
//        pattern6(size);
        pattern7(size);
//        hallowPattern8(size);

    }
}
