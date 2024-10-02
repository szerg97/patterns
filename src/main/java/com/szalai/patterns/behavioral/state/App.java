package com.szalai.patterns.behavioral.state;

public class App {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.changeState(new Moderation(doc));

        doc.render();
        doc.publish();

        doc.render();
        doc.publish();

        doc.render();
        doc.publish();
    }
}
