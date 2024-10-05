package com.szalai.patterns.behavioral.visitor;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Lord of the Rings", 150),
                new Book("Star Wars", 190)
        );
        Visitor visitor = new ShoppingCartVisitor();
        books.forEach(book -> book.accept(visitor));
    }
}
