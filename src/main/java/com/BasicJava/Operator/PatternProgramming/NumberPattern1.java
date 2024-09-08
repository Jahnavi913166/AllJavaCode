package com.BasicJava.Operator.PatternProgramming;

import java.util.Scanner;

/*
1.Pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

2.Pattern
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

3.Pattern
//this type of question is solve using odd rows and evens

1 2 3 4 5
5 4 3 2 1
1 2 3 4 5
5 4 3 2 1

4.Pattern
//this type of question is solve using odd rows and evens

1  2  3  4  5
10 9  8  7  6
11 12 12 14 15
20 19 18 17 16
21 22 23 24 25

5.Pattern
//this type of question is solve using odd rows and evens

1 2 3
6 5 4
7 8 9
12 11 10
13 14 15

6.Pattern
//this type of question is solve using odd rows and evens
1
3 2
4 5 6
10 9 8 7
11 12 13 14 15

7.Pattern
1 2 2 2 2
2 2 3 3 3
3 3 3 4 4
4 4 4 4 5
5 5 5 5 5

8.Pattern
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
public class NumberPattern1 {
    public static void Pattern1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern2(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern3(int size) {
        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) {
                for (int oddL = 1; oddL <= size; oddL++) {
                    System.out.print(oddL + " ");
                }
            } else {
                for (int evenL = size; evenL >= 1; evenL--) {
                    System.out.print(evenL + " ");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern4(int size) {
        //if line is odd->(i-1)*size
        //if line is odd->i*size;
        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) { //if line is odd->(i-1)*size
                int x = (i - 1) * size;
                for (int j = 1; j <= size; j++) {
                    x++;
                    System.out.print(x + "\t");
                }
            } else {
                //if line is odd->i*size;
                int x = i * size;
                for (int j = 1; j <= size; j++) {
                    System.out.print(x + "\t");
                    x--;
                }

            }
            System.out.println();
        }
    }

    public static void Pattern5(int row, int col) {
        for (int i = 1; i <= row; i++) {//5->rows and 3-cols
            if (i % 2 == 0) {
                int x = col * i;
                for (int k = 1; k <= col; k++) {
                    System.out.print(x + " ");
                    x--;
                }
            } else {
                int x = (col * i) - 2;
                for (int K = 1; K <= col; K++) {
                    System.out.print(x + " ");
                    x++;
                }

            }
            System.out.println();

        }
    }


    public static void Pattern6(int size) {
        int count = 0;
        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) {
                int x = (++count) * i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(x + " ");
                    x++;
                }
            }
            System.out.println();
        }

    }

    public static void Pattern7(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            int count = i + 1;
            for (int k = i; k <= size - 1; k++) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern8(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            if (i >= 2) {
                for (int k = i - 1; k >= 1; k--) {
                    if (k != 0) System.out.print(k + " ");
                }
            }

            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void pattern9(int size) {
        int count = 2;
        for (int i = 1; i <= size; i++) {
              for (int j=1;j<=i;j++){

              }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size:");
        int size = sc.nextInt();
//        Pattern1(size);
//        System.out.println();
//        Pattern2(size);
//        System.out.println();
//        Pattern3(size);
//        System.out.println();
//        Pattern4(size);
//        System.out.println();
//        Pattern7(size);
//        System.out.println();
//        Pattern8(size);
//        System.out.println();
//        System.out.println("Enter row and col:");
//        int row, col;
//        row = sc.nextInt();
//        col = sc.nextInt();
//        Pattern5(row, col);
        Pattern6(size);
    }
}
