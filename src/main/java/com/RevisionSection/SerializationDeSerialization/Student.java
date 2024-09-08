package com.RevisionSection.SerializationDeSerialization;

import java.io.Serializable;

public class Student implements Serializable {
    private int stdId;
    private String stdName;
    private int age;

    public Student() {

    }

    public Student(int stdId, String stdName, int age) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.age = age;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void display() {
        System.out.println("Hi my name is Jahnavi Soni");
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName=" + stdName +
                ", age=" + age +
                '}';
    }
}
