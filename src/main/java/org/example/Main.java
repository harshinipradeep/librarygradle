package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();

        books.add("Java Programming");
        books.add("Python Basics");
        books.add("Data Structures");
        books.add("Database Management");

        System.out.println("Book Repository");

        for (String book : books) {
            System.out.println(book);
        }

        System.out.println("Total Books: " + books.size());
    }
}

