package pl.sdacademy.unit.test.exercises.day1.tdd.task4;

import java.util.Objects;

public class Book {
    private final String title;
    private final float price;
    private final Author author;

    public Book(String title, float price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Float.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, author);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", " + "Author: " + author.getFirstName() + ", " + author.getLastName() + "Price: " + price;
    }
}