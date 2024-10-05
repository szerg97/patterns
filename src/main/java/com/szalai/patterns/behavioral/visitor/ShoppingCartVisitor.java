package com.szalai.patterns.behavioral.visitor;

public class ShoppingCartVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.printf("%s has been added your shopping cart.%n", book);
    }
}
