package com.RevisionSection.Classes;

import java.util.Objects;

//hashcode()
//public int hashCode(){return Objects.hash(id,name)}
public class ObjectClass2 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1.getClass());
        System.out.println(Object.class);

        System.out.println(obj1.getClass().getName());
        System.out.println(Object.class.getName());


        //->if you use "+" operator while concatenation its mandatory to hold resultant object
        //->if you use concat method for concatenation of 2 string its not mandatory to hold resultant object
        String s = "jaya";
        //->if you use "+" operator while concatenation its mandatory to hold resultant object
        s = s + "soni";
        System.out.println(s);
        //->if you use concat method for concatenation of 2 string its not mandatory to hold resultant object
        System.out.println(s.concat("2k@gmail.com"));


        //while concatenation if we use permanent variable resultant object will be stored inside non-constant pool area/heap area
        String s1="Javadeveloper";//string pool
        String s2="developer";//string pool
        String s3="Java"+s2;//"java"->string pool //s3="Javadeveloper";//heap area
        System.out.println(s1==s3);//false
        System.out.println(s1.hashCode()+" "+s3.hashCode());
        System.out.println(s3.equals(s1));//true

    }

}
