package com.demo.Staticmembers;

import com.training.AccessModifier.AccessModifier1;

public class StaticMethod {
    //here we have assign the default value that can be change when we want
    int a = 1, b = -1;//Instance variable|non-static variable(it get memory multiple times when we create obj)
    static int k = 20;//static variable(it get memory once when the class is loaded into the memory)

    //when ever we use static variable or method we need to think how we can we declare and define

    //ques
    //is this function do the object specific work?
    void setA(int x) { //Instance method (right way to use)
        a = x;
    }

    void setB(int y) { //Instance method (right way to use)
        b = y;
    }

      //is this function do the object specific work?
     //ans-> no
    // void setK(int z) { //no it is not
   //        k = z;
  //    }

    static void setK(int z) { //static method
        k = z;
        //b++;//not possible to access non-static variable in static method
    }


    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.setA(10);//initialization
        obj.setB(20);//initialization
       // obj.setK(30);//initialization
        setK(29);
        System.out.println("a=" + obj.a);
        System.out.println("b=" + obj.b);
        System.out.println("k=" + k);//for same class we have used directly this variable



//        these content came from this class->AccessModifier1
//        //CREATE THE OBJECT to test access modifier
//        //AccessModifier1 a=new AccessModifier1(); //this object can't be accessible because it is not public so u can't access it outside the package
//        AccessModifier1 a=new AccessModifier1();//this can be accessible because it is public
//        a.f1();
//        // A a1=new A();//this won't be able to access but we can access it indirectly by function
//         a.f1();



    }

}
