package com.training.LambdaExpression;

@FunctionalInterface
interface  I1{
    void show();//default public and abstract method
//    we can also declare object class method
    String toString();

}

class A implements I1{
    @Override
    public  void show(){
        System.out.println("hello");
    }


}

public class Example1 {
    public static void main(String []args){
//        Here we have created the reference of interface and we have provide the implemented class object
        I1 obj=new A();
        obj.show();//it is difficult to maintain
        //we want to avoid this way
//        create class,implement interface,create object then call method
//        this way is to code consuming
    }



}


