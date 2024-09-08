package com.training.OppsConcept;

class Student1 {
    int rollno;
    String name;

    Student1() {

        this.name = "Jaya";
    }

}

class A {
    String name;

    A(String name) {
        this.name = name;
    }

    //example for garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");

    }


}

public class WrapperExample {
    //final keyword to initialize 2 ways
    //final variable can't make any modification if it is primitive datatype
    //if it is not primitive datatype then u can change value of it but u cant reassign
    final int a = 2;

    final int b;

    {
        b = 20;
    }//instance initializer block

    static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[]) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45;//object

        //10 20 pass refernce
        //pass by reference
//        swap(a, b);//we pass refernce(Java is a pass by value)
//        System.out.println(a + " " + b);

//        WrapperExample we = new WrapperExample();
//        System.out.println(we.b);
//
//        final Student1 s1 = new Student1();// non-primitive datatype(object)
//        s1.name = "Jahnavi"; //can be modify
//        System.out.println(s1.name);

        // when a non -primitive is final you cannot reassign it
        //  Student1 s2=new Student1();
        // s1=s2;//can't assign a variable to a final variable

        //garbage collector
        A a;
        for (int i = 0; i < 1000000; i++) {//here garbage collector is automatically call and destroy unused object
            a = new A("OBJECT CREATED");
        }


    }


}
