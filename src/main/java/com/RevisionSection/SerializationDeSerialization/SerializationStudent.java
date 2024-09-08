package com.RevisionSection.SerializationDeSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationStudent {
    public static void main(String[] args) {
        //create the object of student class
        Student student = new Student(101, "Jaya", 23);

        //get the file
        String filePath = "SerializationFile.txt";
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            fos = new FileOutputStream(filePath);
            //it write data as a object
            oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            fos.close();
            oos.close();
            System.out.println("object state is converted into byte stream and data is transferred to the file object");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
