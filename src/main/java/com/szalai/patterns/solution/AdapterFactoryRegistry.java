package com.szalai.patterns.solution;

import java.util.HashMap;
import java.util.Map;

public class AdapterFactoryRegistry {
    private final Map<Class<?>, AdapterFactory> registry = new HashMap<>();

    public void registerFactory(Class<?> clazz, AdapterFactory factory) {
        registry.put(clazz, factory);
    }

    public Adapter createAdapter(Object obj) {
        AdapterFactory factory = registry.get(obj.getClass());
        if (factory != null) {
            return factory.create(obj);
        }
        throw new IllegalArgumentException("No factory registered for class: " + obj.getClass());
    }
}
