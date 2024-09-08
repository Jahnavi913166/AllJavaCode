package com.RevisionSection.CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book>{
    public int bookId;
    public String bookName;
    public static int count;

    static {
        count = 0;
    }


    public Book(String name) {
        this.bookId = (++count) + 2;
        this.bookName = name;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookName(String name) {
        this.bookName = name;
    }


    public String getBookName() {
        return bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    //natural ordering -means implementing something within same class
    //not doing extra
//    public int compareTo(Object givenObj) {
//        //option1
//        //return this.bookId-((Book)givenObj).bookId;
//
//        //option2
//        Book b = (Book) givenObj;
//        return this.bookName.compareTo(b.bookName);
//    }


    @Override
    public int compareTo(Book obj) {
        return  this.bookName.compareTo(obj.bookName);
    }

}
class sortById implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {
        return ((Book)o1).getBookId()-((Book)o2).getBookId();
    }
}

class sortByName implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        //downCasting
        Book b1=(Book)o1;
        Book b2=(Book)o2;
        return b1.getBookName().compareTo(b2.getBookName());
    }

}






