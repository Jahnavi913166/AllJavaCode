package com.BasicJava.Operator.BasicPrograms;

//Perfect No->sum of all divisor excluding that  number itself
//eg-6 -> factor of 6-> 1,2,3 -> 1+2+3=6 ,6==6 that is perfect no
public class PerfectNo {
    public static void main(String[] args) {
        int num = 28, sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num)
            System.out.println("Perfect No");//6,28
        else
            System.out.println("Not Perfect No");


        //print the number like this
        //6362 -> 2,62,362(copy > 9)
        int n = 6362, i = 10;
        int copy = n;
        while (copy > 0) {//copy > 9
            System.out.println(n % i);
            i *= 10;
            copy /= 10;

        }

    }
}
