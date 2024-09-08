package com.RevisionSection;

public class TypeCasting {


// there are two types of typecasting
// 1.Widening Casting (automatically) - converting a smaller type to a larger type size
// 2.Narrowing Casting (manually) - converting a larger type to a smaller size type


    public static void main(String[] args) {
        //widening casting->Widening casting is done automatically when passing a smaller size type to a larger size type:
        byte b = -127;
        double d = b; //automatic casting: byte to double
        System.out.println(d);

        //Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
        //when passing  a larger size type to smaller size type
        int a = 2147483647;
        short s = (short) a;//Manual casting: int to short
        System.out.println(s);


        long var1 = 9223372036854775807L;
        int var2 = (int) var1;
        System.out.println(var1);
        System.out.println(var2);

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);// Outputs 9


    }
}



