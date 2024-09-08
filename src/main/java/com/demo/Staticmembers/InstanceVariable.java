package com.demo.Staticmembers;

class Box {
    //     private int length=10,breath=20,width=30; 1 way
    private int length, breath, width;
    private static int boxCount;
    //static block
    static {
        boxCount=1;
        System.out.println("inside the static block");
    }

    //compiler will combine all the initializer block and after that it initialize all the values to constructor
    {
        //instance initializer will goes to initialize constructor
        length = 1;
        breath = 2;
    }
    {
        width = 3;
    }

    //compiler will combine all the initializer block and after that it initialize all the values to constructor
    //    public Box(){ // 2 way
    //        length=23;
    //        breath=24;
    //        width=40;
    //    }
    public Box() {
    }


    public Box(int l, int b, int h) {
        length = l;
        breath = b;
        width = h;
    }


    public void showDimension() {
        System.out.println("length=" + length);
        System.out.println("breath=" + breath);
        System.out.println("width=" + width);
    }



}

public class InstanceVariable {
    public static void main(String[] args) {
        System.out.println("In Main function");
        Box b1 = new Box(5, 5, 5);//intial value l=1,b=2,h=3 but after creating the value is override
        b1.showDimension();
        Box b2 = new Box();
        b2.showDimension();
    }

}
