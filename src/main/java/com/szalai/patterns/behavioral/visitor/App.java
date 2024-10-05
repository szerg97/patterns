package com.szalai.patterns.behavioral.visitor;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Lord of the Rings", 150);
        book.accept(new ShoppingCartVisitor());
    }
}
