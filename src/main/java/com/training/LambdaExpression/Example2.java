package com.training.LambdaExpression;
@FunctionalInterface
interface I2 {
    void show();//by default its a abstract method
}
public class Example2 {
    public static void main(String[] args) {
//       Anonymous inner class
        I2 obj = new I2() {
            @Override
            public void show() {
                System.out.println("hello");
            }
        };


    }
}

