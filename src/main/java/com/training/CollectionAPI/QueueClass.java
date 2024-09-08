package com.training.CollectionAPI;

import java.util.LinkedList;
import java.util.Queue;

class Student {
    int roll_no;
    String name;
    int age;
    static String school;
    static int counter;

    static {
        school = "Simran public school";
        counter = 0;

    }


    Student(String name, int age) {
        this.roll_no = ++counter;
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student " + "[" + "rollno=" + roll_no + "  " + "name=" + name + "  " + "age=" + age + " " + "school=" + school + "]";
    }

}

public class QueueClass {
    public static void main(String[] args) {
        Queue<Student> queue = new LinkedList<>();
        //add element
//        queue.offer(new Student("Jaya", 23));
//        queue.offer(new Student("Jahnavi", 23));
//        queue.offer(new Student("Shubham", 28));
//        queue.offer(new Student("Uma",50));

        //if we are using offer (),poll(),peek() so if the queue is empty it will return null
        System.out.println(queue);

        //remove element
        System.out.println();
        System.out.println(queue.poll());
        System.out.println(queue);

        //peek element
        System.out.println();
        System.out.println(queue.peek());

        //but if we are using add(),element(),remove() so if the queue is empty it will throw exception
        //it is not giving me any error u can use any one
        System.out.println("another method");
        System.out.println(queue);

        //remove element
        System.out.println();
        System.out.println(queue.poll());
        System.out.println(queue);

        //peek element
        System.out.println();
        System.out.println(queue.peek());
    }
}
