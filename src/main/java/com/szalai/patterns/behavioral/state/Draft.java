package com.szalai.patterns.behavioral.state;

public class Draft implements State {

    private final Document document;

    public Draft(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Rendering draft document: " + document);
    }

    @Override
    public void publish() {
        System.out.println("Publishing draft document: " + document);
        document.changeState(new Published(document));
    }
}
