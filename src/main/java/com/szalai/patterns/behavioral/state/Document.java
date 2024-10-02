package com.szalai.patterns.behavioral.state;

public class Document {
    private State state;

    public Document() {}

    public void render() {
        state.render();
    }

    public void publish() {
        state.publish();
    }

    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Document{" +
                "state=" + state +
                '}';
    }
}
