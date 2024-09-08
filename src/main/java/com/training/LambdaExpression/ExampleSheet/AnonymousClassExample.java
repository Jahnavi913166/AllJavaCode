package com.training.LambdaExpression.ExampleSheet;

import java.io.File;
import java.io.FileFilter;

//Let’s use an anonymous class
public class AnonymousClassExample {
    public static void main(String[] args) {
        //filefilter interface
        // FileFilter files;//declare a interface reference
        //new FileFilter() THIS IS ANONYMOUS CLASS OBJECT
        FileFilter files = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".sql");
            }
        };
        String filepath = "C:/Users/91913/Documents/Oracle Query Samples/Notes of database mastek";
        File directory = new File(filepath);
        File[] file = directory.listFiles(files);
        for (File f : file) {
            System.out.println(f);
        }
    }
}
