package com.practice.java.PatternPrinting;
/*1. square star printing
 * * * *
 * * * *
 * * * *
 * * * *
 */

/*2.left Triangle Star Pattern
 *
 * *
 * * *
 * * * *
 */

/*3.Hollow Square Star Pattern
 ****
 *  *
 *  *
 ****
 */

/* 4.Parallelogram star pattern
 ******
  ******
   ******
    ******
 */

/*5.Mirrored Rhombus Star Pattern
          ****
        ****
      ****
    ****
 */

/*6.Pyramid Star Pattern
             * ->1
            *** ->3
           ***** -> 5
          ******* ->7

 */

/*7.right Triangle star printing
                *
              * *
            * * *
          * * * *
 */

/*8.Inverted Pyramid Star Pattern
        *******
         *****
          ***
           *
 */

/* 9.Hollow Pyramid Star Pattern
              *
             * *
            *   *
           *******
*/
import java.util.Scanner;

public class startPrinting {
    public static void squareStar(int rows, int cols) {
        System.out.println("Square star printing");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void leftTriangleStar(int rows) {
        System.out.println("left Triangle star printing");
        for (int i = 0; i < rows; i++) {//rows
            for (int j = 0; j <= i; j++) {//cols

            }
            System.out.println();
        }
    }

    public static void rightTriangleStar(int rows) {
        System.out.println("right Triangle star printing");
        int count = 0;
        for (int i = 1; i <= rows; i++) {//rows
            count = rows - i;
            for (int j = 1; j <= i; j++) {//cols
                while (count > 0) {
                    System.out.print(" ");
                    count--;
                }
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void hollowSquare(int rows, int cols) {
        System.out.println("Hollow star printing");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i == 1 || i == cols) || (j == 1 || j == cols)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void parallelogramStar(int rows, int cols) {
        System.out.println("Parallelogram star pattern");
        int count = 0;
        for (int i = 1; i <= rows; i++) {//i=1 i=2
            count = i;
            for (int j = 1; j <= cols; j++) {//j=1 j=2 j=3 j=4 j=5
                if (i == 1 || j >= 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
            while (count > 0) {//count=1 ,
                System.out.print(" ");
                count--;
            }
        }

    }

    public static void mirroredRhombusPattern(int rows, int cols) {
        System.out.println("Mirrored Rhombus Star Pattern");
        int count = 0;
        for (int i = 1; i <= rows; i++) {
            count = rows - i;
            for (int j = 1; j <= cols; j++) {
                while (count > 0) {
                    System.out.print(" ");
                    count--;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramidStar(int rows) {
        System.out.println("Pyramid star pattern");
        //length of the rows fixed-7
        int count = 0, starNum = 1;
        //int val = 2;
        for (int i = 1; i <= rows; i++) {
            count = rows - i;
            for (int space = count; space >= 0; space--) {
                System.out.print(" ");
            }
//            while(starNum>0){
//                System.out.print("*");
//                starNum--;
//            }
//            starNum=i+(val++);
            for (int star = 1; star <= starNum; star++) {
                System.out.print("*");
            }
            starNum += 2;
            System.out.println();
        }
    }

    public static void invertedPyramidStar(int rows) {
        //length of the rows is fixed-7
        //this logic is only for input-4
        System.out.println("InvertedPyramidStar");
        int count = 1, starNum = 7;
        for (int i = 1; i <= rows; i++) {
            for (int star = 1; star <= starNum; star++) {
                System.out.print("*");
            }
            starNum -= 2;
            System.out.println();
            for (int space = 1; space <= count; space++) {
                System.out.print(" ");
            }
            count++;
        }
    }
    public static void hollowPyramid(int rows){
        int count=0,starNum=1;
        for(int i=1;i<=rows;i++){
            count=rows-i;
            for(int space=count ;space>=0;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=starNum;star++){
                if(star==1 || star==starNum && star==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            starNum+=2;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();
//        System.out.println("Enter no of cols");
//        int cols = sc.nextInt();
        /*
        squareStar(rows, cols);
        leftTriangleStar(rows);
        hollowSquare(rows, cols);
        parallelogramStar(rows, cols);
        mirroredRhombusPattern(rows,cols);
        rightTriangleStar(rows);
         pyramidStar(rows);
        invertedPyramidStar(rows);
        */
        hollowPyramid(rows);



    }

}
