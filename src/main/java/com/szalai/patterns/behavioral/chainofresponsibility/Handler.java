package com.szalai.patterns.behavioral.chainofresponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}
