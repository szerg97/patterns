package com.szalai.patterns.behavioral.strategy;

public class RoadStrategy implements RouteStrategy{
    @Override
    public void route(String from, String to) {
        System.out.printf("Building path on road between %s and %s%n", from, to);
    }
}
