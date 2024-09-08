package com.BasicJava.Operator.BasicPrograms;

import java.util.concurrent.TimeUnit;

//LCM->least common multiple -two no-common multiple 5 6 ->30(LCM)
public class LCMOf2No {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
//        int n = 1;
//        while (true) {
//            if (n % a == 0 && n % b == 0) {
//                break;
//            }
//            n++;
//        }
//        System.out.println(n);

        //or
        int n = a > b ? a : b;
        int i = n;
        while (true) {
            if (n % a == 0 && n % b == 0) {
                break;
            }
            n += i;
        }
        System.out.println(n);
    }
}
