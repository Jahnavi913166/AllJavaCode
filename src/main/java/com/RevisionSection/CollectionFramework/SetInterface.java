package com.RevisionSection.CollectionFramework;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        /*
        //Note-> set can contains only one null value
        //set is a group of unique element which ignores duplicate objects
        //Set<Object> set = new HashSet<>();//it will show randomly(insertion order is not preserved)
        //Set<Object> set = new LinkedHashSet<>();//it will show the output based on insertion (insertion order is preserved)
        Set<Object> set = new TreeSet<>();//it will show the output in natural ordering

       // set.add(null);
        System.out.println(set);
//        set.add(null);//duplicates are not allow
//        System.out.println(set);
        set.add(23);
        set.add(23);
        set.add(21);

        for (Object ele : set) {
            System.out.print(ele + "\t");
        }

         */

        SetDemo.setDemo1();

        Set<Student1> student=new HashSet<>();
        student.add(new Student1("Jaya Soni",90));
        student.add(new Student1("Shubham Soni",85));
        student.add(new Student1("Ashwani devedi",85));
        System.out.println(student);
        System.out.println(student.size());
//        for (Student1 s:student){
//            System.out.println(s);
//        }
        Iterator<Student1> iterator=student.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
           }
        iterator.remove();

    }
}
//Example 1
class SetDemo{
    public static void setDemo1(){
        String str="JavaDeveloper";
        Set<Character> s=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            s.add(str.charAt(i));
        }
        for(Object el:s){
            System.out.print(el+" ");
        }
        System.out.println();
    }

}

class Student1{
    int stdID;
    String name;
    int percentage;
   private  static  int count;
   static {
       count=0;
   }


    Student1(String name,int percentage){
       this.stdID=count++;
       this.name=name;
       this.percentage=percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return stdID == student1.stdID && percentage == student1.percentage && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stdID, name, percentage);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "stdID=" + stdID +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

}
