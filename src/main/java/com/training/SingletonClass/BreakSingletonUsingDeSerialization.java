package com.training.SingletonClass;

import java.io.*;

/*2 deserialization->way to break singleton pattern using deserialization
  solution->implement readResolve() method

 */

class Students implements Serializable {
    private static Students students;

    private Students() {
    }

    public static Students getInstance() {
        if (students == null) {
            synchronized (Students.class) {
                if (students == null) {
                    students = new Students();
                }
            }
        }
        return students;
    }

    // solution->implement readResolve() method
    //to not break the singleton pattern(reuse the same object)
    //Object-> readResolve()-> this method is from Object class(we implement that object)
    public Object readResolve() {
        return students;
    }


}

public class BreakSingletonUsingDeSerialization {
    public static void main(String[] args) {
        Students s1 = Students.getInstance();
        Students s2 = Students.getInstance();
        System.out.println(s1.hashCode());//1828972342
        System.out.println(s2.hashCode());//1828972342


        //2 way to break singleton pattern using deserialization
        String filepath = "breakSingletonPattern.txt";
        try {
            //serialize the object
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath));
            oos.writeObject(s2);//pass the reference of student

            System.out.println("serialization is done");

            //deserialize the object
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));
            Students s3 = (Students) ois.readObject();
            //before applying the solution we got different object
            //System.out.println(s3.hashCode());//(999661724)
            //after apply the solution we reuse the same object
            System.out.println(s3.hashCode());//1828972342


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
