package com.RevisionSection.Classes;

class Samosa {
    //create a private static variable  of the same class type
    private static Samosa samosa;

    //create a private constructor
    private Samosa() {
    }

    //create a public static method
    //lazy way to creating single object
    public static Samosa getInstance() {
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }

}

class Jalebi {

    //Eager way to creating single object
    // create private static variable and assign object also
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getInstance() {
        return jalebi;
    }


}
//most prefferd way
//using synchronized keyword
public class SingletonClassExample1 {
    public static void main(String[] args) {
        //new Samosa();this obj is created for the first call and next call it is reusing the object
        Samosa samosa1=Samosa.getInstance();
        System.out.println(samosa1.hashCode());
        Samosa samosa2=Samosa.getInstance();
        System.out.println(samosa2.hashCode());

        System.out.println();

        Jalebi jalebi1=Jalebi.getInstance();
        System.out.println(jalebi1.hashCode());
        Jalebi jalebi2=Jalebi.getInstance();
        System.out.println(jalebi2.hashCode());






    }

}
