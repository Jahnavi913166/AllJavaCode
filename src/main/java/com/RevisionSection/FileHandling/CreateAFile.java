package com.RevisionSection.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\91913\\Desktop\\fileOperations.txt";
        File file=new File(path);
        try {
            if(file.createNewFile()){
                System.out.println("File "+file.getName()+" is created successfully");
            }
            else{
                System.out.println("File is already exist in the directory.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
