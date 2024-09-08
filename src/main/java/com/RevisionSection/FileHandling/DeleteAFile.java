package com.RevisionSection.FileHandling;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\91913\\Desktop\\fileOperations.txt";
        File file = new File(path);
        if(file.delete()){
            System.out.println(file.getName()+" is successfully deleted");
        }
        else{
            System.out.println("Unexpected error found in deletion of the file.");
        }
    }
}
