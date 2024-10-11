package com.szalai.patterns.handler;

public abstract class Handler {
    protected abstract void handleSelf(Item item);
    public void handle(Item item) {
        System.out.println("Handling something for every item... ...handled");
        handleSelf(item);
        System.out.println();
    }
}
