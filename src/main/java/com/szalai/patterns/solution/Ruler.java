package com.szalai.patterns.solution;

public class Ruler {

    private final String brand;
    private final int size;

    public Ruler(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }
}
