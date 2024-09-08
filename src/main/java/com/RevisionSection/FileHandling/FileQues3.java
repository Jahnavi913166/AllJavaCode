package com.RevisionSection.FileHandling;

import java.io.*;

/*
File Search:
Problem: Write a Java program that searches for a specific word in a file and counts how many times it occurs.
Hint: Read the file line by line, split each line into words, and check for the word's occurrence.
*/
public class FileQues3 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\91913\\Desktop\\example.txt";
        File file = new File(filePath);
        int count = 0;
        String searchWord = "data";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] word = new String[0];
            while ((line = br.readLine()) != null) {
                word = line.split("\\s+");
            }
            for (String ele : word) {
                if (ele.equalsIgnoreCase("data")) {
                    count++;
                }
            }
            System.out.println("The word " + searchWord + " Occurred " + count + " time");
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
