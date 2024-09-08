package com.training.ObjectClasses;

class Student  implements Cloneable{
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
          return "Student"+"{"+"name="+name+"  "+"age="+age+"}";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CopyObject {
    public static void main(String[] args) {
        Student s1 = new Student("jaya", 23);
        System.out.println();
        System.out.println("original object:"+s1);
        //create a copy of object
        //step1->first we need to implement cloneable interface
        //step2->override clone method and throw CloneNotSupportedException exception
        //step3-> use clone() method -> (object typecast) reference.clone();-> additionally we need to handle exception
        Student s2=null;
        try {
            s2=(Student) s1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("clone object:"+s2);//copy of first object


    }

}
