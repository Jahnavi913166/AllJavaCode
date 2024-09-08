package com.training.SingletonClass;

//most used way and it also, take care of threads, thread save singleton class
class Student {
    private static Student student;

    private Student() {

    }

    public static Student getInstance() {
        //we will apply two, way verification(thread)
        if (student == null) {
            //t1,t2,t3->multiple thread
            //t1 will execute once the t1 will complete the execution then another thread will execute and t2,t3 will when t1 will execute the block
            synchronized (Student.class) {//to make object as thread save
                if (student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }


}

public class SingletonClassExample3 {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        System.out.println(s1.hashCode());
        Student s2 = Student.getInstance();
        System.out.println(s2.hashCode());

    }
}
