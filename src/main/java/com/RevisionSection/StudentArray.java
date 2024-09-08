package com.RevisionSection;

import java.util.Scanner;

public class StudentArray {
    int stuId;
    String name;
    int age;

    public StudentArray(int id, String name, int age) {
        this.stuId = id;
        this.name = name;
        this.age = age;
    }


    public int getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void printStudentData(int[] students) {

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int numOfStudents = sc.nextByte();
        StudentArray[] studentArrays = new StudentArray[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the details of student" + (i + 1));
            System.out.print("Enter id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter age:");
            byte age = sc.nextByte();
            studentArrays[i] = new StudentArray(id, name, age);
        }

        System.out.println("Details of all students");
        for (int i = 0; i < studentArrays.length; i++) {
            System.out.println("Student" + (i + 1) + " " + "ID: " + studentArrays[i].getStuId()+" "+"Name: "+studentArrays[i].getName()
            +" "+"Age: "+studentArrays[i].getAge());
        }
//        for(int i=0;i<studentArrays.length;i++){
//            System.out.println(studentArrays[i].getStuId()+" "+studentArrays[i].getName());      //com.RevisionSection.StudentArray@76fb509a.getId() ,com.RevisionSection.StudentArray@76fb509a.getName()
//            //com.RevisionSection.StudentArray@76fb509a reference of two students
//           // com.RevisionSection.StudentArray@300ffa5d
//        }


    }

}
