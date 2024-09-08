package com.RevisionSection;
//static member means it belongs to the type(class) and not to the instance of that type
//static member can be used in 4 different area(static variable ,static method,static block,static class(nested class))

public class StaticMember {
    public static class Student {
        int stuId;
        String name;
        int age;
        char grade;

        //static variable
        static String school;//this is a common field for all the student

        public Student(int stuId, String name, char grade, int age) {
            this.stuId = stuId;
            this.name = name;
            this.grade = grade;
            this.age = age;


        }

        public void printStudent() {
            System.out.println(this.name + "[" + this.stuId + "," + this.name + "," + this.grade + "," + this.age + "," + Student.school + "]");

        }

        public static void getDetails() {
            System.out.println(Student.school);
            new Student(101,"Jahnavi",'A',24).printStudent();//we can't call the non-static method directly in static method(for that we have to create object of it)
        }


    }


    public static void func() {
        System.out.println("static method");


    }

    public static void main(String[] args) {
        //if the static method is in the same class you can call it directly but writing functionName
        func();
        //and if the static method is out of the class then you have to use classname.functionName
        StaticMember.func();
// --------------------------------------------------------------------------------------------------------
//        Student s = new Student();
//        s.stuId = 101;
//        s.name = "Jahnavi";
//        s.age = 29;
//        s.grade = 'A';
        Student.school = "Simran public school";

//        System.out.println(s.name + "[" + s.stuId + "," + s.name + "," + s.grade + "," + s.age + "," + Student.school + "]");

        Student.getDetails();


    }
}
