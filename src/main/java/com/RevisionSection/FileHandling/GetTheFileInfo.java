package com.RevisionSection.FileHandling;

import java.io.File;

public class GetTheFileInfo {
    public static void main(String[] args) {
        String path = "C:\\Users\\91913\\Desktop\\fileOperations.txt";
        File file = new File(path);
        //check file is exists or not using exists()-> method
        if (file.exists()) {
            //get the name of the file
            System.out.println("The name of the file is: " + file.getName());

            //get path of the file
            System.out.println("The absolute path of the file:" + file.getAbsolutePath());

            // Checking whether the file is writable or not
            System.out.println("is file writable: " + file.canWrite());

            //Checking whether the file is readable or not
            System.out.println("is file readable: " + file.canRead());

            // Getting the length of the file in bytes
            System.out.println("The size of the file in bytes: " + file.length());
        } else {
            System.out.println("File doesn't exists");
        }
    }
}
