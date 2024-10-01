package com.szalai.patterns.behavioral.strategy;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void route(String from, String to) {
        System.out.printf("Building path for walking between %s and %s%n", from, to);
    }
}
