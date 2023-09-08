package ru.mossla.practice.secondPractice;

public class Book {
    private final Author author;
    private final String name;
    private final int year;

    public Book(Author author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
