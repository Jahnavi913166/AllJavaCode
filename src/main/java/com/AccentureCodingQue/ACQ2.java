package com.AccentureCodingQue;

//String Decoder
/*1.You are provide with a string has a sequence of 1s and 0s.
this sequence is the encoded version of a english word,you are suppose to ,
write a program to decode the provided string and find the original word
Each alphabet is representing by a sequence of 1s

for eg-
A:1
B:11
C:111
D:1111
E:11111

INPUT->"101101111"  0 is working here as a separator here
OUTPUT->ABD
and soon upto Z having 26 1s
 */

public class ACQ2 {

    public static String Decoder(String s) {
        //own logic
        //ASCII return alphabets in capital order
        //with repetitive code
        if(s.isEmpty()){
            System.out.println("String is Empty");
            return "";
        }
        int count = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                /*int asciiNum = 64 + count;
                char asciiCode = (char) asciiNum;
                res += asciiCode;
                *///alternative
                res += (char) (64 + count);
                count = 0;
            } else {
                count++;
            }
        }
        //for last coming indexes
        /*int asciiNum = 64 + count;
          char asciiCode = (char) asciiNum;
          res += asciiCode;
         *///alternative
        res += (char) (64 + count);

        return res;
    }

    public static StringBuilder Decoder1(String s) {
        //own logic
        //ASCII return alphabets in capital order
        //without repetitive code
        if (s.isEmpty()) {
            System.out.println("string is empty");
            return new StringBuilder("");
        }
        int count = 0;
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                //res.append(ConvertIntToChar(count));
                res.append((char) (64 + count));
                count = 0;
            } else {
                count++;
            }
        }
        //for last coming indexes
        //res.append(ConvertIntToChar(count));
        res.append((char) (64 + count));

        return res;
    }

    public static char ConvertIntToChar(int count) {
        int asciiNum = 64 + count;
        /*char asciiCode = (char) asciiNum;
        return asciiCode;
        make it in one line
        */
        return (char) asciiNum;
    }

    public static String Decode2(String s) {
        //someones logic
        int count = 0;
        String str = "";
        if (s.isEmpty()) {
            System.out.println("string is empty");
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                if (count > 0) {
                    str += (char) (64 + count);
                    count = 0;
                }
            }
        }
        if(count>0) {
            str += (char) (64 + count);
        }
        return str;
    }


    public static void main(String[] args) {
        //string has a sequence of 1s and 0s(0 should be 1 time)
        //input string always be in uppercase
        String s = "10110111110111";
        System.out.println(Decoder(s));
        System.out.println(Decoder1(s));
        System.out.println(Decode2(s));


    }
}

