package ru.mossla.practice.secondPractice;

import java.util.ArrayList;

public class BookShelf {
    private final ArrayList<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public int size() {
        return books.size();
    }

    public void sortByYear() {
        books.sort((p1, p2) -> {
            if (p1.getYear() == p2.getYear()) return 0;
            return (p1.getYear() < p2.getYear()) ? -1 : 1;
        });
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }
}
