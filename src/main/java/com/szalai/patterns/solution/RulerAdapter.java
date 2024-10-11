package com.szalai.patterns.solution;

public class RulerAdapter implements Adapter {
    private final Ruler ruler;

    public RulerAdapter(Ruler ruler) {
        this.ruler = ruler;
    }

    @Override
    public void handle(AdapterVisitor visitor) {
        visitor.visit(this);
    }

    public Ruler getRuler() {
        return ruler;
    }
}
