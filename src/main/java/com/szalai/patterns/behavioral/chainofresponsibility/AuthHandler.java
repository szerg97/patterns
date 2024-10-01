package com.szalai.patterns.behavioral.chainofresponsibility;

public class AuthHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        System.out.println("AuthHandler handleRequest");
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
