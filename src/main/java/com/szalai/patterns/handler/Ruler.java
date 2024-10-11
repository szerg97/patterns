package com.szalai.patterns.handler;

public class Ruler implements Item {

    private final String brand;
    private final int size;

    public Ruler(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }
}
