package pl.sdacademy.unit.test.exercises.day1.tdd.task4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private static Basket basketTest;

    @BeforeEach
     void init() {
        basketTest = new Basket();
    }

    @Test
    void shouldReturnAllBooksFromBasketIfNotEmpty() {
//        given
        basketTest.basket.add(new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")));
        basketTest.basket.add(new Book("Harry Potter", 70.4f, new Author("J.K", "Rowling")));

        Book[] expected = {new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")),
                new Book("Harry Potter", 70.4f, new Author("J.K", "Rowling"))};
//        when
        Book[] result = basketTest.getAllBooks();
//        then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void shouldReturnAllBooksFromBasketIfEmpty() {
//        given
        Book[] expected = {};
//        when
        Book[] result = basketTest.getAllBooks();
//        then
        assertThat(result).isEmpty();
    }

    @Test
    void shouldAddBookToBasket() {
//        given
        Book[] expected = {new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")), };
//        when
        basketTest.addBook(new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")));
        Book[] result = basketTest.getAllBooks();
//        then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void shouldAddTheSameBookToBasket() {
//        given
        Book[] expected = {new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")), };
//        when
        basketTest.addBook(new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")));
        basketTest.addBook(new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")));
        Book[] result = basketTest.getAllBooks();
//        then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void shouldRemoveAllBooksFromBasketIfNotEmpty() {
//        given
        basketTest.addBook(new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")));
        Book[] expected = {};
//        when
        basketTest.cleanBasket();
        Book[] result = basketTest.getAllBooks();
//        then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void shouldRemoveAllBooksFromBasketIfEmpty() {
//        given
        Book[] expected = {};
//        when
        basketTest.cleanBasket();
        Book[] result = basketTest.getAllBooks();
//        then
        assertThat(result).isEmpty();
    }

    @Test
    void shouldReturnSumOfAllBooksPricesIfNotEmpty() {
//        given
        basketTest.addBook(new Book("Lotr", 50.5f, new Author("J.R.R", "Tolkien")));
        basketTest.addBook(new Book("Harry Potter", 70.4f, new Author("J.K", "Rowling")));

        float expected = 120.9f;
//        when
        float result = basketTest.getTotalAmount();
//        then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void shouldReturnSumOfAllBooksPricesIfEmpty() {
//        given
        float expected = 0f;
//        when
        float result = basketTest.getTotalAmount();
//        then
        assertThat(result).isEqualTo(expected);
    }

}