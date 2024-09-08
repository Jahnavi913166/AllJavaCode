package com.training.AccessModifier;
interface calculation{
    int product(int a,int b);
    int sum(int a,int b);
}
abstract class Product implements calculation{
    //abstract class can have method with implementation or without implementation
    public int product(int a,int b){
        return a*b;
    }
//    int sum(int a,int b); by default a abstract class can contain this functionality

}
//Sum class is a Concrete class
class Sum extends Product{
    public int sum(int a,int b){
        return a+b;
    }
}


public class ConcreteClass {
    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println("Sum :"+s.sum(2,4));
        System.out.println("Product: "+s.product(2,2));

    }
}
