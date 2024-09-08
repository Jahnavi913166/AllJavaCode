package com.BasicJava.Operator;

public class BitwiseOperator {
    public static void main(String[] args) {

        int a = 43;
        int b = -67;
        int c = a & b;// bitwise AND(&) operator
        System.out.println(c);//41
        int d = a | b;//bitwise OR(|) operator
        System.out.println(d);//-65
        int e=a^b; //bitwise XOR(^) operator
        System.out.println(e);


        /*
        int a=57;
        int b=64;
        int c=a&b;
        System.out.println(c);//0
        */

         /*
        int a=-39;
        int b=-84;
        int c=a&b;
        System.out.println(c);
        */

        /*
        int x=-79;
        int y=-34;
        int z=x|y;
        System.out.println(z);


        int x = 24;
        int y = 51;
        int z = x | y;//bitwise OR operator
        System.out.println(z);
        */

        int x=-31;
        int y=-58;
        int z=x^y;
        System.out.println(":"+z);

        int i=-68;//43;
        int j=~i;//bitwise Not(~) operator
        System.out.println(j);


    }

}
