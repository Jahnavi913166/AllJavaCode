package com.RevisionSection.Classes;

/*
1.parameterized constructor
2.non-parameterized constructor
3.copy constructor
*/
class Students {
    private int stdId;
    private String name;
    private int age;

    public Students() {

    }

    public Students(int stdId, String name, int age) {
        this.stdId = stdId;
        this.name = name;
        this.age = age;

    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //copy constructor
    public Students(Students s) {
        this.stdId = s.stdId;
        this.name = s.name;
        this.age = s.age;
    }


}

public class ConstructorConcept {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Jaya", 23);
        System.out.println(s1.getStdId() + " " + s1.getName() + " " + s1.getAge());

        //now make a copy of the constructor
        Students s2 = new Students(s1);
        System.out.println(s1.getStdId());


    }
}
