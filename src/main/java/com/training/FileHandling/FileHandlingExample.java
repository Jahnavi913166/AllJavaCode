package com.training.FileHandling;


import java.io.*;
import java.util.Scanner;

//parent class of every file handling exception is ioexception is the parent class of every file handling class
class ReadFileData {


    public static void writeFile() throws IOException {//FileNotFoundException

        String filepath = "C:/Users/91913/Desktop/readfile.txt";
        FileOutputStream fout;
        fout = new FileOutputStream(filepath);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the company name: ");
        String name = sc.nextLine();
        //to write data into file we need to write it characterbycharacter
        for (int i = 0; i < name.length(); i++) {
            fout.write(name.charAt(i));
        }
        fout.close();
        System.out.println("data stored successfully..");

    }

    public static void appendfile() throws IOException {//FileNotFoundException

        String filepath = "C:/Users/91913/Desktop/readfile.txt";
        FileOutputStream fout;
        fout = new FileOutputStream(filepath, true);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the company name: ");
        String name = sc.nextLine();
        //to write data into file we need to write it characterbycharacter
        for (int i = 0; i < name.length(); i++) {
            fout.write(name.charAt(i));
        }
        fout.close();
        System.out.println("data stored successfully..");

    }

    public static void readfile() throws IOException {
        String filepath = "C:/Users/91913/Desktop/readfile.txt";
        FileInputStream fin = new FileInputStream(filepath);
        //now read data from the file
        int i;
        do {
            i = fin.read();
            if (i != -1) {
                System.out.println((char) i);
            }
        } while (i != -1);
        fin.close();


    }

    //    character  stream
    public static void writeDataToFile() throws IOException {
        String path = "C:/Users/91913/Desktop/readfile.txt";
        FileWriter file = new FileWriter(path);
        BufferedWriter buffer = new BufferedWriter(file);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter campany name:");
        String name = sc.nextLine();
        buffer.write(name);
        buffer.close();


    }

    public static void readDataToFile() throws IOException {
        String filepath = "C:/Users/91913/Desktop/readfile.txt";
        FileReader file = new FileReader(filepath);
        BufferedReader reader = new BufferedReader(file);
        String s = reader.readLine();
        reader.close();
        System.out.println(s);
    }


}

public class FileHandlingExample {

    public static void main(String[] args) {
        try {
//            ReadFileData.writeFile();
//            ReadFileData.appendfile();
//            ReadFileData.readfile();
//            ReadFileData.writeDataToFile();
            ReadFileData.readDataToFile();
        } catch (IOException f) {

            System.out.println(f.getMessage());
        }


    }


}
