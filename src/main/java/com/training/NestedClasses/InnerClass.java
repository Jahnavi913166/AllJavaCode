package com.training.NestedClasses;

//type1-nested inner class
//inner class can access any private instance variable of the outer class.
class OuterClass {
    private static int a;

    public void show() {
        System.out.println("outer class");
    }

    class InnerClass {

        public void display() {
            System.out.println("inner class");
            a = 10;
            System.out.println(a);
        }


    }

}

// Class 1
// Outer class
//class Outer {
//
//    // Method defined inside outer class
//    void outerMethod() {
//
//        // Print statement
//        System.out.println("inside outerMethod");
//    }
//
//    // Class 2
//    // Inner class
//    class InnerClass {
//
//        // Main driver method
//        public static void main(String[] args) {
//
//            // Display message for better readability
//            System.out.println("inside inner class Method");
//        }
//    }
//}


//2.Method Local Inner Classes
//Inner class can be declared within a method of an outer class
//eg1
//class Outer {
//    void outerMethod() {
//        System.out.println("inside outer method");
//        //Method Local Inner Classes-> a class inside the method
//        class Inner {
//            void innerMethod() {
//                System.out.println("inside inner class method");
//            }
//
//        }
//        //create object of inner class and call the inner method
//        Inner n = new Inner();
//        n.innerMethod();
//    }
//
//
//}

//eg2
class Outer {
    void outerMethod() {
        int x = 90;//local non final variable
        final int y = 99;//local final variable
        System.out.println(++x);
        class Inner {
            void innerMethod() {
                //System.out.println(x);//non-final is not accessible in inner  class
                System.out.println(y);//local final variable can be accessible in inner class but non-final is not accessible
            }

        }
        Inner n = new Inner();
        n.innerMethod();

    }

}


//3.static nested class


public class InnerClass {
    public static void main(String[] args) {
//        type1-nested inner class
//        OuterClass outerClass = new OuterClass();//it is fine for outer class
//        outerClass.show();
//
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();//this is a way to call innerclass object
//        innerClass.display();

//        type2-Method Local Inner Classes
//        eg1
//        Outer o1 = new Outer();
//        o1.outerMethod();

//         eg2
//         Outer o1 = new Outer();
//         o1.outerMethod();





    }

}
