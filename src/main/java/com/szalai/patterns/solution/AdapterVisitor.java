package com.szalai.patterns.solution;

public interface AdapterVisitor {
    void visit(PenAdapter pen);
    void visit(RulerAdapter ruler);
}
