package com.szalai.patterns.behavioral.visitor;

public class ShoppingCartVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.printf("The following book [%s] has been added your shopping cart.%n", book);
    }

    @Override
    public void visit(Pen pen) {
        System.out.printf("This almighty pen [%s] has been added your shopping cart.%n", pen);
    }
}
