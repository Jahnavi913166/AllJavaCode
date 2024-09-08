package com.practice.java.CollectionFramework;

//import java.lang.reflect.Type;

import com.training.OppsConcept.Emp;

import java.util.*;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;

public class ListClass {
    public static void searchElement(ArrayList<String> list, String search) {
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(search)) {
                System.out.println(list.indexOf(list.get(i)));
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("it is not found");
        }
    }

    public static void maxMin(ArrayList<Integer> list) {
        Integer max = list.get(0);
        Integer min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Min val: " + min + "\t" + "Max val: " + max);
    }


    public static void main(String[] args) {
        //list Interface
        /*
        List<Integer> li1 = new ArrayList<>();
        //ArrayList<Integer> li2=new ArrayList<>();
        li1.add(58);
        li1.add(2);
        li1.add(33);
        li1.add(96);
        li1.add(20);
        li1.add(3);

        System.out.println(li1);
        li1.add(2, 90);
        System.out.println(li1);
        System.out.println("remove value: " + li1.remove(3));
        //li1.clear();
        System.out.println("size: " + li1.size());
        System.out.println("get value: " + li1.get(3));
        System.out.println(li1.contains(90));
        System.out.println(li1);
        System.out.println("return index of that object:" + li1.indexOf(90));
        System.out.println(li1.lastIndexOf(10));//if val is not present it'll return -1 .

        System.out.println();
        System.out.println("Iteration of object..");
        //3 ways

        System.out.println("---------------------------");
        System.out.println("1 way");
        for (int i = 0; i < li1.size(); i++) {
            System.out.println(li1.get(i));
        }

        System.out.println("---------------------------");
        System.out.println("2 way");
        for (Integer i : li1) {
            System.out.println(i);
        }

        System.out.println("---------------------------");
        System.out.println("Iterator");
        Iterator<Integer> it = li1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------------");
        System.out.println(li1);
        Collections.sort(li1);
        System.out.println(li1);


        //Write a Java program to create an ArrayList of strings. Add five different strings to the list and print the list.
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Papaya");
        list.add("Orange");
        System.out.println(list);

        //Write a Java program to access the first and last elements of an ArrayList of integers. Print both elements
        ArrayList<Integer> li1 = new ArrayList<>();
        li1.add(58);
        li1.add(2);
        li1.add(33);
        li1.add(96);
        li1.add(20);
        li1.add(3);
        //0 n-1;
        System.out.println("first element: " + li1.get(0) + "\t" + "last element: " + li1.get(li1.size() - 1));

        //Write a Java program to update a specific element in an ArrayList of strings (e.g., replace the third element with a new value) and print the updated list.
        //3 e->new value
        System.out.println(list);
        list.set(2, "Mango");
        System.out.println(list);

        //Write a Java program to search for an element in an ArrayList of strings.
        //If the element is found, print its position; otherwise, print a message saying it is not found.
        System.out.println(list);
        String search = "Mango";
        searchElement(list, search);

        //Write a Java program to convert an ArrayList of strings to an array and print the array
        String[] array = list.toArray(new String[list.size()]);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Write a Java program to reverse the elements of an ArrayList of strings and print the reversed list.
        System.out.println("\n---------------------------");
        String swap = "";
        int i = 0, j = list.size() - 1;
        while (i < j) {
            swap = list.get(i);
            list.set(i, list.get(j));
            list.set(j, swap);
            i++;
            j--;

        }
        System.out.println("Reverse list..");
        System.out.println(list);
        //Write a Java program to find the maximum and minimum values in an ArrayList of integers.
        System.out.println("\n---------------------------");
        System.out.println(li1);
        maxMin(li1);

        //Create a class Student with properties name and grade. Write a Java program to create an ArrayList of Student objects,
        // add several students to the list, and print the names and grades of all students
        ArrayList<Student> stud = new ArrayList<>();
        stud.add(new Student("Jahnavi Soni", 'A'));
        stud.add(new Student("Ashwani Dewevdi", 'B'));
        stud.add(new Student("Shubham Soni", 'A'));
        stud.add(new Student("Jaya Soni", 'A'));
        System.out.println(stud);


    }

//    Create a class Employee with properties name and salary. Write a Java program to create an ArrayList of Employee objects,
//    and sort the employees based on their salary in descending order. Print the sorted list
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Shubham Soni", 3000000));
        emp.add(new Employee("Akash Gupta", 40000));
        emp.add(new Employee("Jahnavi Soni", 600000));
        System.out.println(emp);

        //comparable interface/comparator interface
        //Collections internally use comparable interface to sort objects
        //Collections.sort(emp);//natural ordering->Ascending order
        //Collections.sort(emp);//descending order
        //System.out.println(emp);


        //comparator interface
        //Collections.sort(emp, Comparator.reverseOrder());//descending order
        //System.out.println(emp);

        //anonymous class
        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary()-o1.getSalary();
            }
        });
        System.out.println(emp);

        //lamda expression
        Collections.sort(emp,(o1,o2)-> o1.getName().compareTo(o2.getName()));
        System.out.println(emp);



        //Write a Java program to extract a portion of an ArrayList of integers (e.g., from index 2 to 5) and print the sublist.
        List<Integer> li1 = new ArrayList<>();
        li1.add(58);
        li1.add(2);
        li1.add(33);
        li1.add(96);
        li1.add(20);
        li1.add(3);
        List<Integer> li2 = new ArrayList<>();
        int idx1 = 2, idx2 = 5;
        for (int i = idx1; i <= idx2; i++) {
            li2.add(li1.get(i));
        }
        System.out.println(li2);

         */

        //Write a Java program to find the frequency of each element in an ArrayList of strings

        ArrayList<String> list = new ArrayList<>(6);
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Orange");
        list.add("Grapes");
        list.add("Grapes");
        list.add("Papaya");
        list.add("Orange");
        list.add("Banana");
        list.add("Banana");
        System.out.println(list);
        Map<String, Integer> map = new TreeMap<>();
        String key="";
        for(int i=0;i<list.size();i++){
            key=list.get(i);
            if(map.containsKey(key)){
                map.replace(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        System.out.println(map);


    }

}
