package com.szalai.patterns.solution;

public class RulerAdapterFactory implements AdapterFactory {
    @Override
    public Adapter create(Object obj) {
        return new RulerAdapter((Ruler) obj);
    }
}
