package com.szalai.patterns.handler;

public class PenHandler extends Handler{
    @Override
    public void handleSelf(Item item) {
        if (item instanceof Pen pen) {
            System.out.println("Handling Pen: ");
            System.out.println("brand: " + pen.getBrand());
            System.out.println("color: " + pen.getColor());
        }
    }
}
