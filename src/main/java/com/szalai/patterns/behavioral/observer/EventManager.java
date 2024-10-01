package com.szalai.patterns.behavioral.observer;

import java.util.HashMap;
import java.util.Map;

public class EventManager {

    private final Map<String, EventListener> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListener listener){
        listeners.put(eventType, listener);
    }

    public void unsubscribe(String eventType, EventListener listener){
        listeners.remove(eventType, listener);
    }

    public void notify(String eventType, String data){
        listeners.forEach((k, v) -> {
            if (k.equals(eventType))
                v.update(data);
        });
    }
}
