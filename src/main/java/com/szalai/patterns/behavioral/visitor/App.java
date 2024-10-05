package com.szalai.patterns.behavioral.visitor;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Item> books = List.of(
                new Book("Lord of the Rings", 150),
                new Pen(20)
        );
        Visitor visitor = new ShoppingCartVisitor();
        books.forEach(book -> book.accept(visitor));
    }
}
