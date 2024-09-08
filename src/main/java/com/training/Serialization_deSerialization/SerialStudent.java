package com.training.Serialization_deSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialStudent {
    public static void main(String[] args) {
        //create object of Student
        Student student = new Student("jaya", "jaya.soni@gmail.com", 23, "ahmedabad");

        String filepath = "testSerialize.txt";
        try {
            // write data to file(we are writing data in stream format)
            FileOutputStream fos = new FileOutputStream(filepath);
            //it write data as a object
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //how to serialize
            oos.writeObject(student);
            fos.close();
            oos.close();
            System.out.println("object state is converted into byte stream and data is transferred to the file object");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
