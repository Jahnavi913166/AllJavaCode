package com.training.LambdaExpression.ExampleSheet;

import java.io.File;
import java.io.FileFilter;

//FileFilter THIS IS A INTERFACE PROVIDED BY JAVA
//The FileFilter interface is a standard interface provided by Java in the java.io package,
class JavaFileFilter implements FileFilter {

    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".sql");//.java,.sql
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        JavaFileFilter javaFileFilter;
        String filepath = "C:/Users/91913/Documents/Oracle Query Samples/Notes of database mastek";
        File directory = new File(filepath);
        //this code will give all extension files
        File[] javafile = directory.listFiles();
        /*for (File f : javafile) {
            System.out.println(f);
        }*/
        //this code will give only .java extension files
        javafile = directory.listFiles(new JavaFileFilter());
        for (File f : javafile) {
            System.out.println(f);
        }

    }

}