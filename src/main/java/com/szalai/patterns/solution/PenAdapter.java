package com.szalai.patterns.solution;

public class PenAdapter implements Adapter {
    private final Pen pen;

    public PenAdapter(Pen pen) {
        this.pen = pen;
    }

    @Override
    public void handle(AdapterVisitor visitor) {
        visitor.visit(this);
    }

    public Pen getPen() {
        return pen;
    }
}
