package com.szalai.patterns.behavioral.strategy;

public class QuackMuted implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
