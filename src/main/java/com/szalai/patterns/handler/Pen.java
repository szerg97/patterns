package com.szalai.patterns.handler;

public class Pen implements Item {

    private final String brand;
    private final String color;

    public Pen(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
