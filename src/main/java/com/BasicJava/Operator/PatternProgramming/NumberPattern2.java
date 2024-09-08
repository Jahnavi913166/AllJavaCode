package com.BasicJava.Operator.PatternProgramming;

import java.util.Scanner;
interface A{
}
/*

1. Pattern
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

2.Pattern
      1
     121
    12321
   1234321

3.
  1111A1111
  222BBB222
  33CCCCC33
  4DDDDDDD4
  55EEEEE55
  666FFF666
  7777G7777

4.  1       5
      2   4
        3
      2   4
    1       5

*/
public class NumberPattern2 {
    public static void pattern1(int lines) {
        for (int i = 1; i <= lines; i++) {
            if (i % 2 != 0) {//for odd lines
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.print(0 + " ");
                    } else {
                        System.out.print(1 + " ");
                    }
                }
            }
            System.out.println();

        }
    }

    public static void pattern2(int lines) {
        for (int i = 1; i <= lines; i++) {
            int count = lines - i;
            for (int k = 1; k <= count; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int dif = i - 1; dif >= 1; dif--) {
                System.out.print(dif);
            }

            System.out.println();
        }
    }

    public static void pattern3(int lines) {
        int number = (lines / 2) + 1;//for odd numbers diamond work properly
        int count = 1;
        int alpha = 1;
        char alphabet = 'A';
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(count + "\t");
            }
            for (int k = 1; k <= alpha; k++) {
                System.out.print(alphabet + "\t");//A
            }
            for (int j = 1; j <= number; j++) {
                System.out.print(count + "\t");
            }
            System.out.println();

            count++;
            if (i < (lines / 2) + 1) {
                number--;
                alpha += 2;
            } else {
                number++;
                alpha -= 2;
            }
            alphabet++;


        }
    }

    public static void pattern4(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                if (i == j || j == (lines + 1 - i)) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern5(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            int count = i + 1;
            for (int j = count; j <= lines; j++) {
                System.out.print(count + " ");
            }
            System.out.println();

        }
    }

    public static void pattern6(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int back = i - 1; back >= 1; back--) {
                System.out.print(back);
            }
            System.out.println();
        }
    }

    public static void pattern7(int lines) {
        int space = lines - 1;
        int stars = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            stars++;
        }
    }

    public static void pattern8(int lines) {
        int space = lines - 1;
        int stars = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars || i == lines)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            space--;
            stars++;
        }
    }


    public static void Triangle(int lines) {
        int space = lines - 1;
        int stars = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            space--;
            stars++;
        }
    }

    public static void pattern9(int lines) {
        int space = lines - 1;
        int stars = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            space--; //by 1
            stars += 2;
            System.out.println();
        }
    }

    public static void pattern10(int lines) {
        int space = lines - 1;
        int stars = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars || i == lines)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            space--; //by 1
            stars += 2;
            System.out.println();
        }
    }

    public static void pattern11(int lines) {
        int space = lines - 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            int count = i - 1;
            for (int j = count; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space--;
        }
    }

    public static void pattern12(int lines) {
        for (int i = 1; i <= lines; i++) {
            if (i % 2 != 0) {//odd lines
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0)
                        System.out.print(0 + " ");
                    else
                        System.out.print(1 + " ");
                }
            }
            System.out.println();

        }
    }

    public static void pattern13(int lines) {
        int num = (lines / 2) + 1;
        int alpha = 1;
        char alphabet = 'A';
        int number = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(number);
            }
            for (int j = 1; j <= alpha; j++) {
                System.out.print(alphabet);
            }
            for (int j = 1; j <= num; j++) {
                System.out.print(number);
            }
            number++;
            if (i < (lines / 2) + 1) {
                alpha += 2;
                num --;
            } else {
                alpha -= 2;
                num ++;
            }
            alphabet++;
            System.out.println();
        }

    }


    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int lines = sc.nextInt();
        //pattern1(lines);
        //pattern2(lines);
        //pattern3(lines);
        //pattern4(lines);
        //pattern5(lines);
        //pattern6(lines);
        //pattern7(lines);
        //pattern8(lines);
        //pattern9(lines);
        //pattern10(lines);
        //pattern11(lines);
        //pattern12(lines);
        pattern13(lines);

    }
}
