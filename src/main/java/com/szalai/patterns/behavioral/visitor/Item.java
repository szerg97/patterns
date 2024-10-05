package com.szalai.patterns.behavioral.visitor;

public interface Item {
    void accept(Visitor visitor);
}
