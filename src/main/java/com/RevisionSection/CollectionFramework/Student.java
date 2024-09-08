package com.RevisionSection.CollectionFramework;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
    int id;
    String name;
    int yop;

    public Student(int id, String name, int yop) {
        this.id = id;
        this.name = name;
        this.yop = yop;
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yop=" + yop +
                '}';
    }
    @Override
    public int compareTo(Student givenObject){
        return this.id-givenObject.id;

    }

}
//class sortByIds implements Comparator {
//    @Override
//    public int compare(Object o1, Object o2) {
//        return ((Student)o1).getId()-((Student)o2).getId();
//    }
//
//
//}
class sortByNames implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return (((Student)o1).getName().compareTo(((Student)o2).getName()));
    }
}
class sortByYop implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student)o1).getYop()-((Student)o2).getYop();
    }
}





