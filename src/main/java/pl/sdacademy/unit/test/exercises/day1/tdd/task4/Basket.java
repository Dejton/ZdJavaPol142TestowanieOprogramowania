package pl.sdacademy.unit.test.exercises.day1.tdd.task4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basket {
    Set<Book> basket = new HashSet<>();
    public Basket() {
    }

    public Book[] getAllBooks() {
        return basket.toArray(basket.toArray(new Book[0]));
}

public void addBook(Book book) {
    basket.add(book);
}
public void cleanBasket() {
    basket.clear();
}

public float getTotalAmount() {
        List<Float> totalAmountList =  basket.stream()
                .map(Book::getPrice)
                .toList();
        float totalAmount = 0;
        for (float e : totalAmountList) {
            totalAmount += e;
        }
        return totalAmount;
}
}