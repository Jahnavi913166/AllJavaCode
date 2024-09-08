package com.training.OppsConcept;

abstract class Students{
    int rollno;
    String name;
    Students(){

    }

    Students(int rollno, String name){
        System.out.println("abstract constructor called");
        this.rollno=rollno;
        this.name=name;
    }
    abstract public void display();

}

class Jahnavi extends Students{

    Jahnavi(){
        super(1,"Jaya");
    }

    public void display(){
        System.out.println(this.rollno);
        System.out.println(this.name);
    }


}

public class Abstractclass_understand {
    public static void main(String []args) {

        //this is example of how a abstract class reference is used via child class
        Students s=new Jahnavi();
        s.display();

        Jahnavi j=new Jahnavi();
        j.display();

    }
}
