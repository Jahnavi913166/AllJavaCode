package com.training.Serialization_deSerialization;

import java.io.*;

public class SerialProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Maggi", 40);
        System.out.println(p1);
        Product p2 = new Product("pasta", 90);
        System.out.println(p2);

        String filepath="testProduct.txt";
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            //to write data in file
            fos=new FileOutputStream(filepath);

            //write data as object form
            oos=new ObjectOutputStream(fos);

            //serialize object to byte stream
            oos.writeObject(p1);

            fos.close();
            oos.close();
            System.out.println("data is transferred successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
