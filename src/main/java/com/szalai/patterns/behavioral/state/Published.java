package com.szalai.patterns.behavioral.state;

public class Published implements State {

    private final Document document;

    public Published(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Rendering published document: " + document);
    }

    @Override
    public void publish() {
        System.out.println("Publishing published document (no change in state): " + document);
    }
}
