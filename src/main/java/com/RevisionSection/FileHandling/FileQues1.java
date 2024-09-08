package com.RevisionSection.FileHandling;

import java.io.*;
import java.util.Scanner;

/*
Basic File Handling:
Problem: Write a Java program to create a file named "example.txt" and write "Hello, World!" to it. Then read the content from the file and display it.
Hint: Use FileWriter to write to the file and FileReader to read from it.
*/
public class FileQues1 {
    public static void readData(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);//FileNotFoundException
        int i;
        do {
            i = fis.read();//IOException
            if (i != -1) {
                System.out.println((char) i);
            }

        }
        while (i != -1);
        fis.close();

    }

    public static void writeData(File file) throws IOException {
        FileWriter fw = new FileWriter(file);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Content:");
        String content = sc.nextLine();
        fw.write(content);
        fw.close();


    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\91913\\Desktop\\example.txt";
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                writeData(file);
                readData(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

