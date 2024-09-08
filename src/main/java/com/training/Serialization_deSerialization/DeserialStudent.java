package com.training.Serialization_deSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialStudent {
    public static void main(String[] args) {
        String filepath = "testSerialize.txt";
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(filepath);

            //to read data from the objects
            ois = new ObjectInputStream(fis);

            //now deserialize data from the sequence of byte Stream into objects
            Student student = (Student) ois.readObject();
            System.out.println(student);

            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
