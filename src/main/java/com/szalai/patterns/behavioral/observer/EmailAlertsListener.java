package com.szalai.patterns.behavioral.observer;

public class EmailAlertsListener implements EventListener{

    private final String email;
    private final String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String file) {
        System.out.printf(message + "%n", email, file);
    }
}
