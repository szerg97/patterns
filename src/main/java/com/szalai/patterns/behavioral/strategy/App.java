package com.szalai.patterns.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        Navigator navigator = Navigator.getInstance();

        navigator.setStrategy(new WalkingStrategy());
        navigator.buildRoute("A", "B");

        navigator.setStrategy(new PublicTransportStrategy());
        navigator.buildRoute("A", "B");

        navigator.setStrategy(new RoadStrategy());
        navigator.buildRoute("A", "B");
    }
}
