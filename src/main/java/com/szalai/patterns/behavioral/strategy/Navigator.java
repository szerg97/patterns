package com.szalai.patterns.behavioral.strategy;

public class Navigator {

    private static Navigator instance;
    private RouteStrategy strategy;

    private Navigator(){}

    public static Navigator getInstance(){
        if (instance == null){
            instance = new Navigator();
        }
        return instance;
    }

    public void setStrategy(RouteStrategy routeStrategy){
        strategy = routeStrategy;
    }

    public void buildRoute(String from, String to) {
        strategy.route(from, to);
    }
}
