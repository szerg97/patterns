package com.szalai.patterns.handler;

import java.util.HashMap;
import java.util.Map;

public class HandlerFactory {

    private static final Map<Class<? extends Item>, Handler> handlers = new HashMap<>();

    static {
        handlers.put(Ruler.class, new RulerHandler());
        handlers.put(Pen.class, new PenHandler());
    }

    public static Handler getHandler(Item item) {
        return handlers.get(item.getClass());
    }
}
