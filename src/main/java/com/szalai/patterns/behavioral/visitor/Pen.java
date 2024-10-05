package com.szalai.patterns.behavioral.visitor;

public class Pen implements Item{

    private final int price;

    public Pen(int price) {
        this.price = price;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "price=" + price +
                '}';
    }
}
