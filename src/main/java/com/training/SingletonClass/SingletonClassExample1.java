package com.training.SingletonClass;

//there is some point to create singleton class
/*
1.private constructor
2.create object with the help of method and method should be static so that you don't need to create a object of that class
3.create static reference of object type(to store object is private)
 */
class Samosa {
    //create static reference of object type(to store object is private)
    private static Samosa samosa;

    //if we make this constructor as private so, it can't be call from outside this class
    private Samosa() {

    }


    //lazy way to creating single object
    public static Samosa getInstance() {
        // return new Samosa();//if we don't provide any condition so if we call this method it will create the object multiple time
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }
}

public class SingletonClassExample1 {
    public static void main(String[] args) {
        //Samosa samosa1 = new Samosa();//'Samosa()' has private access in 'com.training.SingletonClass.Samosa'
        //WE CAN'T CALL PRIVATE CONSTRUCTOR DIRECTLY
        Samosa samosa1 = Samosa.getInstance();//here both the instance create only one object and it is reusing it many times
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getInstance();//here both the instance create only one object and it is reusing it many times
        System.out.println(samosa2.hashCode());

        Jalebi j1 = Jalebi.getInstance();
        System.out.println(j1.hashCode());
        Jalebi j2 = Jalebi.getInstance();
        System.out.println(j2.hashCode());
    }

}
