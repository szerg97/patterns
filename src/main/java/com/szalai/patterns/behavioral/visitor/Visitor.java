package com.szalai.patterns.behavioral.visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Pen pen);
}
