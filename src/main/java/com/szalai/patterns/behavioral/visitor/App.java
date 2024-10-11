package com.szalai.patterns.behavioral.visitor;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Item> items = List.of(
                new Book("Lord of the Rings", 150),
                new Pen(20)
        );
        Visitor visitor = new ShoppingCartVisitor();
        items.forEach(book -> book.accept(visitor));
    }
}
