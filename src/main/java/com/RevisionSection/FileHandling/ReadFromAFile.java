package com.RevisionSection.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromAFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\91913\\Desktop\\fileOperations.txt";
        File file = new File(path);
        try {
            Scanner dataReader = new Scanner(file);
            while(dataReader.hasNextLine()){
                String fileData= dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
