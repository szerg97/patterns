package com.szalai.patterns.behavioral.strategy;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void route(String from, String to) {
        System.out.printf("Building path for public transport between %s and %s%n", from, to);
    }
}
