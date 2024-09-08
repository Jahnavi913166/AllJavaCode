package com.training.NestedClasses;

//type3- Static Nested Classes
//Static and Non-static Nested Classes
//static class or non-static class

/*static class
1.It does not require any reference of the outer class.
2.The property of the static class is that it does not allows us to access the non-static members of the outer class.
*/

/*non-static class
1.It does require  reference of the outer class.
2.The property of the non-static class is that it does  allows us to access the non-static members as well as static members of the outer class.
 */

class OuterClass1 {
    private static String message;
    private int a = 10;

    public static void show() {
        System.out.println("i am outerClass method");
    }

    //static nested class
    static class InnerStaticClass {
        //static class can have static or non-static method both
        //A static class can access only the static members of the outer class.
        public void displayMessage() {
            message = "innerStaticClass";//static member
            System.out.println("static member:" + message);


        }

        public static void displayShow() {
            show();
            System.out.println("inside InnerStaticClass");

        }
    }

    //Non-static/inner nested class
    class InnerNonStaticClass {
        //non-static class can have static or non-static method both
        //Inner classes can access both static and non-static members of the outer class
        public void displayMessage() {
            message = "InnerNonStaticClass";
            System.out.println("static member: " + message);//static member
            System.out.println("non-static member: " + a);//non-static member
        }

        public static void displayShow() {
            show();
            System.out.println("inside InnerNonStaticClass");
        }


    }


}

public class StaticClass {
    public static void main(String[] args) {
        //OuterClass1.show();

        //static nested class
        //creating static nested class instance/object
        OuterClass1.InnerStaticClass staticVar = new OuterClass1.InnerStaticClass();
        staticVar.displayMessage();//non-static method
        OuterClass1.InnerStaticClass.displayShow();//static method


        //non-static nested class
        //creating non-static class instance/object
        // Note: In order to create instance of Inner class
        //  we need an Outer class instance

        // Creating Outer class instance for creating
        // non-static nested class

        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerNonStaticClass nonStaticClass = outerClass1.new InnerNonStaticClass();
        nonStaticClass.displayMessage();//static method
        OuterClass1.InnerNonStaticClass.displayShow();//non-static method


    }
}
