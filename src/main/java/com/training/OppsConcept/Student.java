package com.training.OppsConcept;

public class Student {
    int rollno;
    String name;
    float marks;

//    Student() {  1
//        this.rollno = 12;//s1.rollno=12
//        this.name = "jahnavi Soni";//s1.name="jahnavi Soni"
//        this.marks = 89.23f;//s1.marks=89.23f;
//    }


    Student() {
        //this keyword is also used to call constructor from another constructor
        // internally-> new Student(14,"default person",89);//call overloaded constructor
        this(14, "default person", 89);
    }


    //    this keyword will replace with s2
    Student(int rollno, String name, float marks) { //2
        this.rollno = rollno;//s2.roll
        this.name = name;//s2.name
        this.marks = marks;//s2.marks
    }

    //COPY CONSTRUCTOR
    Student(Student other) {  //3
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }


    public static void main(String args[]) {
//        Student s1 = new Student(); 1
//        System.out.println(s1.rollno);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);

        Student s2 = new Student(1, "JAYA", 89);//constructor overloading  2
        System.out.println(s2.rollno);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        Student s3 = new Student(1, "shubham", 89); //3
        Student random = new Student(s3);
        System.out.println(random.marks);

        Student random1 = new Student();
        System.out.println(random1.name);

        Student one=new Student();
        Student two=one;//both one and two object are pointing to the same object
        one.name="change something";
        System.out.println(two.name);//change something (pointing to same object)


    }


}
