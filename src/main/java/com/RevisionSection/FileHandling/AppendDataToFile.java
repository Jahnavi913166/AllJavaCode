package com.RevisionSection.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppendDataToFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\91913\\Desktop\\fileOperations.txt";
        File file = new File(path);
        FileOutputStream fos = null;
        FileInputStream fis=null;
        try {
            if (file.exists()){
                file.createNewFile();
                fos=new FileOutputStream(file,true);
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter name: ");
                String Name=sc.nextLine();
                for(int i=0;i<Name.length();i++){
                    fos.write((char)Name.charAt(i));
                }
            }
            if(file.canRead()){
                fis=new FileInputStream(file);
                int i;
                do{
                    i=fis.read();
                    if(i!=-1){
                        System.out.println((char)i);
                    }
                }while(i!=-1);

            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
