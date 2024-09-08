package com.training.Serialization_deSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialProduct {
    public static void main(String[] args) {
        String filepath = "testProduct.txt";//existing path
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(filepath);
            //read data through byte stream
            ois = new ObjectInputStream(fis);

            //deserialize
            Product product=(Product) ois.readObject();
            System.out.println(product);
            System.out.println("data is converted into object successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
