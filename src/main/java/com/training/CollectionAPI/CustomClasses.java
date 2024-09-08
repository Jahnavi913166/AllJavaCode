package com.training.CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomClasses {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(2, "Shubham Soni", 20000000, "Software Engineer"));
        list.add(new Employee(4, "Jahnavi Soni", 20000, "developer"));
        list.add(new Employee(1, "Harsh", 20000, "Associate consultant"));
        System.out.println(list);

        //to sort objects using comparable interface()
        //ordering based on id
        /*Collections.sort(list);//it internally use comparable interface to sort the objects
        System.out.println("sort(natural ordering) based on id: " + list);//ascending order
        */

        //ordering based on name
        /*Collections.sort(list);
        System.out.println("sort(natural ordering) based on name: " + list);//ascending order
        */

        //if i want to do dynamic ordering
        // Comparator interface is used to perform custom ordering
        /*Collections.sort(list, Comparator.reverseOrder());
        System.out.println("sort(): " + list);
        */

        //we can customize ordering
        //anonymous class
        System.out.println("Compare with empname (name wise)");
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmpName().compareTo(o2.getEmpName());
            }
        });
        System.out.println(list);

        System.out.println();
        System.out.println("Compare with id (id wise)");
        //lamba expression
        Collections.sort(list, (o1, o2) -> o1.getEmpId() - o2.getEmpId());
        System.out.println(list);


    }

}
