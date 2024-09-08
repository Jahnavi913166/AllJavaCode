package com.BasicJava.Operator.BasicPrograms;

//suppose i have number->394566 and i wanna add this not ,if result is one digit print it otherwise add again
public class AddNumUntilDigitBecomeOne {
    static int sum(int number) {
        int add = 0;
        while (number > 0) {
            add += number % 10;
            number /= 10;
        }
        return add;
    }

    public static void main(String[] args) {
//        int n = 394566;
//        while (true) {
//            int tempSum = sum(n);
//            if (tempSum <= 9) {
//                System.out.println(tempSum);
//                break;
//            } else {
//                n = tempSum;
//            }
//        }

        //nested loop

//        int sum = 0, n = 9299;
//        do {
//            while (n > 0) {
//                sum += n % 10;
//                n /= 10;
//            }
//            n = sum;
//            sum = 0;
//
//        } while (n > 9);
//        System.out.println(n);//current n have sum value


//        int n = 3455;
//        int sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//            if (n == 0 && sum > 9) {
//                n = sum;
//                sum = 0;
//            }
//        }
//        System.out.println(sum);



    }
}
