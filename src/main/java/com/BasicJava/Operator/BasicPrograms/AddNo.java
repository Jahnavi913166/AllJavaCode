package com.BasicJava.Operator.BasicPrograms;

//4567 ->i want to add this no
public class AddNo {
    public static void main(String[] args) {
//        int num = 4567, sum = 0;
//        while (num > 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println("Sum of the number:" + sum);

        //we can also do this using for loop
        int num = 3456, sum = 0;
        for (sum = 0; num > 0; num /= 10) {
            sum += num % 10;
        }
        System.out.println(sum);


        while (true) {
            sum += num % 10;
            num /= 10;
            if (num == 0)
                break;
        }
    }
}
