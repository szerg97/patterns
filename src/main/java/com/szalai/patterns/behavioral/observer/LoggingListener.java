package com.szalai.patterns.behavioral.observer;

public class LoggingListener implements EventListener{

    private final String path;
    private final String message;

    public LoggingListener(String path, String message) {
        this.path = path;
        this.message = message;
    }

    @Override
    public void update(String file) {
        System.out.printf(message + "%n", file);
    }
}
