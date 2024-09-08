package com.demo.Staticmembers;

public class TypeOfVariables {
    int a;//Instance variable | value type variable(ordinary variable)|non-static variable
    static int b;//static variable+value type variable
    static String c;////static variable+reference variable

    String s1;//reference variable(String class) |Instance variable

    public static void main(String[] args) {
        TypeOfVariables obj = new TypeOfVariables();
        //local variable | reference variable

        //obj->local variable | reference variable
        // local variable->this var is created inside the method
        // reference variable-> class obj

        //default value of Instance or static members
        //value type variable-> depends on datatype (default value)
        //reference variable->nullable type(null value)

        // TypeOfVariables obj->what will be the of this reference variable?
        // TypeOfVariables obj ->blank values because local variable

        //local variable are blank variable by default
        //local +value type variable
        //local + nullable type variable
        //in both case value will be blank
        //eg->
        //int a(inside method declare) local +value type variable
        //TypeOfVariables obj (inside method declaration)local + nullable type variable


        //Instance variable have default values depends of datatype
        //Instance+value type variable
        //Instance+nullable type variable (default values null)//reference variable
        //eg->
        //int a;Instance+value type variable
        //String s;Instance+nullable type variable

        //static variable have default values depends of datatype
        //static variable+value type variable
        //static variable+nullable type variable (default values nul)//reference variable
        //eg->
        //static int b;//static variable+value type variable
        // static String c;////static variable+reference variable


    }

}
