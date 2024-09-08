package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;

// 153 ->count digit 3
// 1*3+5*3+3*3=153
//153==153 this is amstrong no
public class AmStrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),count=0;
        int copy=num,sum=0;
        while(num>0){
            count++;
            num/=10;
        }
        num=copy;
        while (num>0){
            int digit=num%10;
            int prod=1;
            for(int i=1;i<=count;i++){
                prod*=digit;
            }
            sum+=prod;
            num/=10;
        }
        if(copy==sum)
            System.out.println(copy+" AmStrong number");
        else
            System.out.println(copy+" not AmStrong number");


        //builtin code
//        int num = 153, cpy = num;
//        int len = (num + "").length();
//        int sum = 0;
//        while (num > 0) {
//            sum += (int) Math.pow(num % 10, len);
//            num /= 10;
//        }
//        if (cpy == sum) System.out.println("Armstrong no");
//        else System.out.println("not a Armstrong no");


    }
}
