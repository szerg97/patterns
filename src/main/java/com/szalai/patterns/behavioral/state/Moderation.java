package com.szalai.patterns.behavioral.state;

public class Moderation implements State {

    private final Document document;

    public Moderation(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Rendering moderation document: " + document);
    }

    @Override
    public void publish() {
        System.out.println("Publishing moderation, setting to draft: " + document);
        document.changeState(new Draft(document));
    }
}
