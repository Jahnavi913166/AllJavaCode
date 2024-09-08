package com.RevisionSection;

public class InstanceVariable {
    public static class Box {
        //ways to intialize instance variable:

        //1.during declartion in the class
        int length = 23, breadth = 24, height = 25;
        static int boxCount = 0;

        //static block get the memory before constructor call
        static {
            boxCount = 1;
            System.out.println("inside the static block");
        }


        //instance intializer
        //compiler will combine all the initializer block and after that it initialize all the values to constructor

        {
            length = 23;
            breadth = 45;
        }

        {
            height = 90;
        }


        public Box() {

        }

        //2.constructor
        public Box(int l, int b, int h) {
            boxCount++;
            length = l;
            breadth = b;
            height = h;

        }

        //3. instance method
        public void intializeVal() {
            this.length = 2;
            this.breadth = 3;
            this.height = 4;
        }

        public void showDimension() {
            System.out.println(this.length + " " + this.breadth + " " + this.height);
        }

        public void areaOfReact() {
            System.out.println("area of rectangle: " + this.length * this.breadth * this.height);

        }

        //

    }


    public static void main(String[] args) {
        Box b1 = new Box();
        //b1.intializeVal();
        b1.showDimension();

        Box b2 = new Box(22, 33, 44);
        //b2.intializeVal();
        b2.showDimension();
        System.out.println(Box.boxCount);


    }
}
