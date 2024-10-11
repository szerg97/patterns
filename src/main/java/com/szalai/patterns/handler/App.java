package com.szalai.patterns.handler;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        final List<Item> items = new ArrayList<>(List.of(
                new Pen("MyPen", "blue"),
                new Ruler("MyRuler", 30)
        ));
        for (Item item : items) {
            final Handler handler = HandlerFactory.getHandler(item);
            if (handler != null) {
                handler.handle(item);
            }
            else {
                System.out.println("No such handler");
            }
        }
    }
}
