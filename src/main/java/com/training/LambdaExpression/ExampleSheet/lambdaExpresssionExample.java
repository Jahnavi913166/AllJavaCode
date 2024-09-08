package com.training.LambdaExpression.ExampleSheet;

import java.io.File;
import java.io.FileFilter;

public class lambdaExpresssionExample {
    public static void main(String[] args) {
        FileFilter fileFilter;
       // (pass parameter) this parenthesis accepts parameter(if any method accept then pass it there )
        fileFilter=(File pathname)->pathname.getName().endsWith(".sql");
      // fileFilter=(File pathname)->pathname.getName().endsWith(".sql");lambda


    }

}

