package com.training.LambdaExpression;
@FunctionalInterface
interface Human{
    void eat();
}

public class Example3 {
    public static void main(String[] args){
        //lambda expression
        Human h=()-> System.out.println("lambda expression");
        h.eat();//call the FunctionalInterface method
    }

}
