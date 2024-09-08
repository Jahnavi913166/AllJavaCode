package com.RevisionSection;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class StringClass {

    public static void distinct() {
        //W.A.P to print distinct letter in string
        //The distinct characters should be printed in same order as they appear in input string.
        /*Input  : Geeks for Geeks
          Output : for

          Input  : Hello Geeks
          Output : HoGks
        */


    }



    public static void main(String[] args) {
      /*String object can be created in two ways-
        1.using new keyword
        2.using  string literal " "
      */
        //first time this will create two objects first in heap area or second in string pool
        // String s1=new String("Jaya");
        //now here Jvm will check the literal is present inside the string pool
        //"Jaya"->if yes it will reuse that existing reference.
        //"Jaya"->otherwise new String will be created inside the string pool
        //and for new String("Jaya")->this will always create a new Object inside the heap area if the similar object is present or not
      /*  String s2=new String("Jaya");
        System.out.println(s1==s2);//false //reference comparison
        System.out.println(s1.equals(s2));//true // content comparison

       */


        //concept1
        /*
        String str1="JavaDeveloper"; //1 object created
        String str2="Java";//1 object
        String str3=str2+"developer"; //1 object for "developer" only
        //STR3 WILL STORE IN THE HEAP AREA
       // When you concatenate strings using the + operator, Java typically does not automatically place the result in the String Pool.
        // Instead, a new String object is created on the heap.
        //This happens because the concatenation of strings at runtime involves creating a new string that Java treats as a non-literal value,
        // and non-literal strings are not automatically interned.
        System.out.println(str1==str3);//false

         */

        //To store str3 in the String Pool, you would need to explicitly intern it using str3.intern().

        String s1 = "JavaDeveloper"; //1 object will created which will store in string pool
        String s2 = "Java"; //1 object will created which will store in string pool
        //String s3=s2+"developer";  //1 object will created which will store in string pool for "developer" literal
        //but here s2 is not literal so it will consider as non-literal value for that java will create a new string in the heap area
        String s3 = (s2 + "developer").intern();
        System.out.println(s1 == s3);

//"--------------------------------------------------------------------------------------------------------------------------------------------"
        //methods of String class
        // 1. int length()-> return integer
        String string = "JavaDevelopment";
        System.out.println("length: " + string.length());

        // 2.char charAt(int idx)->return character
        System.out.println("charAt: " + string.charAt(2));
        System.out.println("----");
        // System.out.println(string.charAt(24));StringIndexOutOfBoundsException

        // 3.String toLowerCase()/toUpperCase-> both return string
        System.out.println("indexOf: " + string.toLowerCase() + " " + string.toUpperCase());

        //4.int indexOf(char ch)->return integer index
        System.out.println("indexOf: " + string.indexOf('D'));//return the index of that character

        //int indexOf(char ch, int fromIndex)->starting the search from the specified index (fromIndex).
        //ch: The character to search for.
        //fromIndex: The index from which to start the search
        System.out.println("indexOf: " + string.indexOf('D', 3));//idx:4 found
        System.out.println("indexOf: " + string.indexOf('D', 5));//idx:-1 not found

        //int indexOf(String str, int fromIndex)->search a search
        System.out.println("indexOf: " + string.indexOf("lopm", 4));//-> return first occurrence of that string

        //5. String replace(char ch1/oldChar,char ch2/newChar)-> return string and replace character
        //"JavaDevelopment"
        System.out.println("replaceCharacter: " + string.replace('D', 'd'));
        //String replace(String s1/oldStr,String s2/newStr)-> return string
        System.out.println("replaceString: " + string.replace("Development", ""));

        //substring
        System.out.println(string.substring(2,5));


        //string.equalsIgnoreCase(anotherstring)
        System.out.println();
        String s="JavaDevelopment";
        if(string.equalsIgnoreCase(s)){
            System.out.println("equality check");
        }









    }


}



