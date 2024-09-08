package com.BasicJava.Operator.BasicPrograms;

//GCD->Greatest common divisor
public class GCDOrHCF {
    public static void main(String[] args) {
        int a = 30, b = 60;
        //compare which is least no and take the loop from its half
        int n = a > b ? a : b;
        while (true) {
           if(a%n==0 && b%n==0){
               break;
           }
           n--;
        }
        System.out.println(n);
    }
}
