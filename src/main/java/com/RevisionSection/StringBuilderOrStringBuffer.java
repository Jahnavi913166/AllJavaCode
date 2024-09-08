package com.RevisionSection;

public class StringBuilderOrStringBuffer {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder();
        // System.out.println(sb.capacity());//default capacity is 16
        StringBuilder sb = new StringBuilder(10);
        System.out.println(sb.capacity());
        sb.append("jaya.soni2k@gmail.com");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(sb1.lastIndexOf("J"));
        System.out.println(sb1.lastIndexOf("J", 2));
        System.out.println(sb1.insert(2, "jaya"));
        sb1.setCharAt(1, 'A');
        System.out.println(sb1);

        System.out.println(sb1.capacity());
        //void trimToSize(): This method attempts to reduce storage used for the character sequence.
//        sb1.trimToSize();
//        System.out.println(sb1.capacity());


//        public void getChars(int srcBegin, int srcEnd,
//        char[] dst, int dstBegin)
        //this method is used to get the character from the char array
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        StringBuilder stringBuilder = new StringBuilder("JavaDeveloper");
        char[] ch = new char[7];
        stringBuilder.getChars(0, 3, ch, 4);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }

}
