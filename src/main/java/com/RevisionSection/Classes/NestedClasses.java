package com.RevisionSection.Classes;


//type 1 nested inner class
class OuterClass1 {
    private static int a;

    void show() {
        System.out.println("Outer class");
    }

    //It can access any private instance variable of the outer class
    class InnerClass {
        void display() {
            System.out.println("InnerClass");
            System.out.println(a);
            a = 20;
            System.out.println(a);
        }

    }


}
//static class or non-static
/*static class
1.It does not require any reference of the outer class.
2.The property of the static class is that it does not allows us to access the non-static members of the outer class.
*/

/*non-static class
1.It does require  reference of the outer class.
2.The property of the non-static class is that it does  allows us to access the non-static members as well as static members of the outer class.
 */
class OuterClass2 {
    int a;
    int b;
    static String name;

    void add(int a, int b) {
        System.out.println(a + b);
    }
    static int sub(int a,int b){
        return a-b;
    }



    static class InnerStaticClass {
        void printStatic() {
            System.out.println("InnerStaticClass");
            //System.out.println(a);//inside the static class u can access non-static member
            name = "staticVariable";
            System.out.println(name);
        }

        public static void display() {
            System.out.println("static class static method");
            System.out.println(name);

        }


    }

    class InnerNonStaticClass {
        void nonStaticMethod() {
            System.out.println("InnerNonStaticClass");
            add(2,3);
            System.out.println(sub(3,2));
            System.out.println(a+" "+b);
            name="jaya";
            System.out.println(name);
        }

    }


}


public class NestedClasses {
    public static void main(String[] args) {
        //type 1 nested inner class
        OuterClass1 outerClassReference = new OuterClass1();
        outerClassReference.show();

        OuterClass1.InnerClass innerClass = outerClassReference.new InnerClass();//non-static class
        innerClass.display();

        //type2 static and non-static class
        //static nested class
        //creating static nested class instance/object
        OuterClass2.InnerStaticClass staticRef = new OuterClass2.InnerStaticClass();
        staticRef.printStatic();//non-static method
        OuterClass2.InnerStaticClass.display();//static method


        //non-static nested class
        //creating non-static class instance/object
        // Note: In order to create instance of Inner class
        //  we need an Outer class instance

        OuterClass2 outerClass2=new OuterClass2();
        OuterClass2.InnerNonStaticClass nonStaticRef=outerClass2.new InnerNonStaticClass();
        nonStaticRef.nonStaticMethod();


    }

}
