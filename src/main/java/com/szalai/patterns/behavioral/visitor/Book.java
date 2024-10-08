package com.szalai.patterns.behavioral.visitor;

public class Book implements Item {

    private final String name;
    private final int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
