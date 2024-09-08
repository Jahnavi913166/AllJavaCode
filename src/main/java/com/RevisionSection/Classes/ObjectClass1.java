package com.RevisionSection.Classes;

import java.util.Objects;

//toString(),equals(),"=="
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student" + "[" + id + "," + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student s = (Student) obj;
        return name.equals(s.name) && id == s.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }



}

public class ObjectClass1 {


    public static void main(String[] args) {
        //toString()
        Student s1 = new Student(101, "Jahnavi Soni");
        Student s2 = new Student(102, "Shubham Soni");
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s1.toString());
        System.out.println();

        //before overriden the method
        //.equals() only compare non-primitive
        System.out.println(".equals(): " + s1.equals(s2));//default behaviour//false
        System.out.println(s1.hashCode() + " " + s2.hashCode());
        //== can be compare primitive or non-primitive
        System.out.println("double equals to: " + (s1 == s2));//compare object reference//false
        System.out.println();


        Student s3 = new Student(101, "Jahnavi Soni");
        Student s4 = new Student(101, "Jahnavi Soni");
        //after overriden the method
        System.out.println(".equals(): " + s3.equals(s4));//true
        System.out.println(s3.hashCode() + " " + s4.hashCode());
        //== can be compare primitive or non-primitive
        System.out.println("double equals to: " + (s3 == s4));//compare object reference//false


        System.out.println();
        Student s5 = new Student(101, "Jahnavi Soni");
        s5 = new Student(101, "Jahnavi Soni");
        //after overriden the method
        System.out.println(".equals(): " + s5.equals(s5));//true
        System.out.println(s5.hashCode() + " " + s5.hashCode());
        //== can be compare primitive or non-primitive
        System.out.println("double equals to: " + (s5 == s5));//compare object reference//false



        int a=10;
        int b=20;
        if(10==20){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

}
