package com.lzp.bean;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    private String[] books;
    private List<String> bookList;
    private Set<String> bookSet;
    private Map<String,String> bookMap;
    private List<Book> listBook;

    public Student() {
    }

    public Student(String[] books, List<String> bookList, Set<String> bookSet, Map<String, String> bookMap, List<Book> listBook) {
        this.books = books;
        this.bookList = bookList;
        this.bookSet = bookSet;
        this.bookMap = bookMap;
        this.listBook = listBook;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getBookList() {
        return bookList;
    }

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public Set<String> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<String> bookSet) {
        this.bookSet = bookSet;
    }

    public Map<String, String> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, String> bookMap) {
        this.bookMap = bookMap;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

    @Override
    public String toString() {
        return "Student{" +
                "books=" + Arrays.toString(books) +
                ", bookList=" + bookList +
                ", bookSet=" + bookSet +
                ", bookMap=" + bookMap +
                ", listBook=" + listBook +
                '}';
    }
}
