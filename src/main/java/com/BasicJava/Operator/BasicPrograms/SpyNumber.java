package com.BasicJava.Operator.BasicPrograms;

import java.util.Scanner;
//calculate factor of 6
//1+2+3=1*2*3,6==6 this is spy number

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int sum=0,pro=1;
        for(int i=1;i<=n/2;i++){
            int factor=n%i;
            sum+=factor;
            pro*=factor;
        }
        if(sum==pro){
            System.out.println("spy number");
        }
        else{
            System.out.println("not spy number");
        }
    }
}
