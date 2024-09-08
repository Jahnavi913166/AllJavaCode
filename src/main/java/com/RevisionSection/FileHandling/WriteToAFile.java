package com.RevisionSection.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\91913\\Desktop\\fileOperations.txt";
        File file = new File(path);
        try {
            if (file.exists()) {

                FileWriter fw = new FileWriter(file);
                fw.write("I am Jahnavi Soni");
                fw.close();
                System.out.println("Content is wrote into the file successfully");
            } else {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
