package com.szalai.patterns.handler;

public class RulerHandler extends Handler{
    @Override
    public void handleSelf(Item item) {
        if (item instanceof Ruler ruler) {
            System.out.println("Handling Ruler: ");
            System.out.println("brand: " + ruler.getBrand());
            System.out.println("size: " + ruler.getSize());
        }
    }
}
