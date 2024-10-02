package com.szalai.patterns.behavioral.strategy;

public class QuackLoud implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm quacked!");
    }
}
