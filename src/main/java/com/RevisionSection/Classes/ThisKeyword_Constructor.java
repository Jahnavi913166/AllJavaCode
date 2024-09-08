package com.RevisionSection.Classes;

class Faculty {
    String facName;
    Faculty() {
        this("JAYA");
    }

    Faculty(String facName) {
        this.facName=facName;
    }
}

public class ThisKeyword_Constructor {
    public static void main(String[] args) {
        Faculty f=new Faculty();
        System.out.println(f.facName);
    }
}
