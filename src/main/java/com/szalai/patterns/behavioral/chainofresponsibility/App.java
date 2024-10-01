package com.szalai.patterns.behavioral.chainofresponsibility;

public class App {
    public static void main(String[] args) {
        Handler handler1 = new AuthHandler();
        Handler handler2 = new ValidationHandler();
        Handler handler3 = new CacheHandler();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        handler1.handleRequest("request1");
    }
}
