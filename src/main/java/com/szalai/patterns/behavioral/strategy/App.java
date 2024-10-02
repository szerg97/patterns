package com.szalai.patterns.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new QuackLoud());

        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new QuackLoud());

        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new QuackMuted());

        duck.performFly();
        duck.performQuack();
    }
}
