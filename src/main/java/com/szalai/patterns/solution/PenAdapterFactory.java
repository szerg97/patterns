package com.szalai.patterns.solution;

public class PenAdapterFactory implements AdapterFactory {
    @Override
    public Adapter create(Object obj) {
        return new PenAdapter((Pen) obj);
    }
}
