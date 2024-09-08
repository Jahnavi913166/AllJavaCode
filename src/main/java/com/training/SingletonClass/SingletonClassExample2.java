package com.training.SingletonClass;

class Jalebi {
    private static Jalebi jalebi = new Jalebi();
//Eager way to creating  singleton object
    public static Jalebi getInstance() {
        return jalebi;
    }


}

public class SingletonClassExample2 {
    public static void main(String[] args) {
        Jalebi j1 = Jalebi.getInstance();
        System.out.println(j1.hashCode());
        Jalebi j2 = Jalebi.getInstance();
        System.out.println(j2.hashCode());

    }
}
