package com.szalai.patterns.solution;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        final List<Object> items = new ArrayList<>(List.of(
                new Pen("MyPen", "blue"),
                new Ruler("MyRuler", 30)
        ));

        AdapterFactoryRegistry registry = new AdapterFactoryRegistry();

        registry.registerFactory(Pen.class, new PenAdapterFactory());
        registry.registerFactory(Ruler.class, new RulerAdapterFactory());

        AdapterVisitor visitor = new ConcreteAdapterVisitor();

        for (Object obj : items) {
            Adapter adapter = registry.createAdapter(obj);
            adapter.handle(visitor);
        }
    }
}
