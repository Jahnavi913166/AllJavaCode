package com.training.SingletonClass;

import java.io.Serializable;

//3. to break singleton pattern /class we can use clone() method
/*
1.possibility
->Object class->clone() method-> to use this we need to implements, Cloneable interface and also we need to override that clone() method
2.solution
->clone() return class reference;


*/
class Student1 implements Cloneable {
    private static Student1 student;

    private Student1() {
    }

    public static Student1 getInstance() {
        if (student == null) {
            synchronized (Students.class) {
                if (student == null) {
                    student = new Student1();
                }
            }
        }
        return student;
    }

    //1.before apply solution ->possibility

//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //2.after apply solution
    public Object clone() throws CloneNotSupportedException {
        return student;
    }

}

public class BreakSingletonPatternUsingClone {
    public static void main(String[] args) {
        System.out.println("same object");
        Student1 s1 = Student1.getInstance();
        System.out.println(s1.hashCode());
        Student1 s2 = Student1.getInstance();
        System.out.println(s2.hashCode());

        //to break singleton pattern /class we can use clone() method
        //1.before apply solution ->possibility
        /*try {
            Student1 s3=(Student1)s2.clone();
            System.out.println("different object");
            System.out.println(s3.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
         */
        //2.after apply solution
        try {
            Student1 s3 = (Student1) s2.clone();
            System.out.println("same object");
            System.out.println(s3.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}

