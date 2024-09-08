package com.RevisionSection.FileHandling;

import java.io.*;
import java.nio.Buffer;

/* File Manipulation:

 Problem: Write a Java program to count the number of words in a text file.
 Hint: Use BufferedReader to read the file line by line, split each line into words, and count them.
*/
public class FileQue2 {
    public static int numberOfWords(FileReader file, String filePath) {
        int count = 1;
        try {
            file = new FileReader(filePath);
            BufferedReader br = new BufferedReader(file);
            int i;
            do {
                i = br.read();
//                if (i != -1) {
//                    System.out.println((char) i);
//                }
                if (((char) i) == ' ') {
                    count++;
                }
            } while (i != -1);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    //Count Words in a File
    //\\s: This is a shorthand character class in regular expressions that matches any whitespace character,
    // including spaces, tabs, and newline characters.
    public static int countWordsFile(String filepath) throws IOException {
        int wordsCount=0;
        BufferedReader br=new BufferedReader(new FileReader(filepath));
        String line;
        while((line=br.readLine())!=null){
            String[] words=line.split("\\s+");
            wordsCount+=words.length;
            System.out.println(wordsCount);
        }
        br.close();
        return wordsCount;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\91913\\Desktop\\example.txt";
        FileReader file = null;
        //System.out.println("Number of words in a file: " + numberOfWords(file, filePath));
        try {
            System.out.println("Number of words in a file: " + countWordsFile( filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
