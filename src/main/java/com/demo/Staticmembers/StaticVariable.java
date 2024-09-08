package com.demo.Staticmembers;

class DiffClass {
    static int eye = 2;//static variable
    String name = "Jahnavi Soni";//non-static variable
}

public class StaticVariable {
    //here we have assign the default value that can be change when we want
    int a = 1, b = -1;//Instance variable|non-static variable(it get memory multiple times when we create obj)
    static int k = 20;//static variable(it get memory once when the class is loaded into the memory)

    public static void main(String[] args) {
        StaticVariable obj = new StaticVariable();
        System.out.println("same class variable");
        System.out.println("a=" + obj.a + " " + "b=" + obj.b);
        //static variable(can access in three way if it is in same class)
        System.out.println("1 way \n" + "k=" + obj.k);
        System.out.println("2 way \n" + "k=" + k);
        System.out.println("3 way \n" + "k=" + StaticVariable.k);

        System.out.println("\n");
        System.out.println("same class variable");
        System.out.println("after changing values");
        //we can also change the value of its variable
        obj.a = 23; //Instance variable
        obj.b = 24; //Instance variable
        k = 90;  //static variable (we can write variable name directly if it is in same class)

        System.out.println("a=" + obj.a + " " + "b=" + obj.b);
        System.out.println("1 way \n" + "k=" + obj.k);
        System.out.println("2 way \n" + "k=" + k);
        System.out.println("3 way \n" + "k=" + StaticVariable.k);

        System.out.println("\n");
        System.out.println("Different class variable");
        DiffClass d = new DiffClass();
        System.out.println("name=" + d.name);
//        System.out.println("eye="+eye);//this can't be access like this because it in diff class if it is same class so that can be accessible
        //if it is in diff class so there is two way to access static member variables
        System.out.println("1 way \n" + "k=" + d.eye);
        DiffClass.eye=23;
        System.out.println("2 way \n" + "k=" + DiffClass.eye);//preferred way
    }
}
