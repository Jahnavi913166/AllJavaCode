package com.RevisionSection.SerializationDeSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationStudent {
    public static void main(String[] args) {
     String filePath="SerializationFile.txt";
        FileInputStream fio = null;
        ObjectInputStream ois;

        try {
            fio=new FileInputStream(filePath);

            ois=new ObjectInputStream(fio);

            Student s=(Student) ois.readObject();
            System.out.println(s);
            fio.close();
            ois.close();
            System.out.println("now stream is convert to object");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
