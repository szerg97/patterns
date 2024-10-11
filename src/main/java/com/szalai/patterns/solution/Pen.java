package com.szalai.patterns.solution;

public class Pen {

    private final String brand;
    private final String color;

    public Pen(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
