package com.RevisionSection.CollectionFramework;

import java.util.Arrays;
import java.util.Scanner;

public class ComparableAndComparator {
    public static void studentSorting(Student[] students, Scanner sc) {
        System.out.println("Before Sorting");
        for (Student s : students) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getYop());
        }
        System.out.println("Enter sortBy:");
        String sortBy = sc.next();
        if (sortBy.equalsIgnoreCase("Id")) {
            Arrays.sort(students);
        } else if (sortBy.equalsIgnoreCase("name")) {
            Arrays.sort(students, new sortByNames());
        } else if (sortBy.equalsIgnoreCase("yop")) {
            Arrays.sort(students, new sortByYop());//ascending
            Arrays.sort(students, new sortByYop().reversed());//descending
        }
        System.out.println("After Sorting");
        for (Student s : students) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getYop());
        }

    }

    public static void main(String[] args) {

        /*
        Book[] books = {new Book("Good Habits"), new Book("Do Epic shit"), new Book("Secrets")};
        System.out.println("Before Sorting");
        for (Book i : books) {
            System.out.println(i.getBookId() + " " + i.getBookName());
        }

        //if we pass only one parameter then it will perform the natural sorting by using comparable interface
        Arrays.sort(books);

        System.out.println("\nAfter sorting ");
        for (Book i : books) {
            System.out.println(i.getBookId() + " " + i.getBookName());
        }

        System.out.println("\n\n------------------------------------------------------------------------------------");
        //custom ordering use comparator interface sort by id
        System.out.println("Before Sorting");
        for (Book i : books) {
            System.out.println(i.getBookId() + " " + i.getBookName());
        }
        Arrays.sort(books, new sortById());
        System.out.println("\nAfter sorting ");
        for (Book i : books) {
            System.out.println(i.getBookId() + " " + i.getBookName());
        }

        System.out.println("\n\n------------------------------------------------------------------------------------");
        //custom ordering use comparator interface sort by name
        System.out.println("Before Sorting");
        for (Book i : books) {
            System.out.println(i.getBookId() + " " + i.getBookName());
        }
        Arrays.sort(books, new sortByName());
        System.out.println("\nAfter sorting ");
        for (Book i : books) {
            System.out.println(i.getBookId() + " " + i.getBookName());
        }


        //by using anonymous class
        System.out.println("\n\n------------------------------------------------------------------------------------");

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookId() - o2.getBookId();
            }
        });
        for (Book i : books) {
            System.out.println(i.getBookId() + " " + i.getBookName());
        }

        //by using lambda expression
        System.out.println("\n\n------------------------------------------------------------------------------------");
        Arrays.sort(books, (o1, o2) -> o1.bookId - o2.bookId);
        for (Book i : books) {
            System.out.println(i.getBookId() + " " + i.getBookName());
        }
        */


        Student[] students = {new Student(105, "Jahnavi Soni", 2024), new Student(102, "Shubham Soni", 2022),
                new Student(101, "Harsh", 2022), new Student(101, "Ajay Soni", 2021)};
        Scanner sc = new Scanner(System.in);
        studentSorting(students, sc);


    }
}
