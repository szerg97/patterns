package com.szalai.patterns.behavioral.observer;

public class Editor {

    private final EventManager events;
    private String file;

    public Editor(){
        events = new EventManager();
    }

    public void openFile(String file){
        this.file = file;
        events.notify("open", this.file);
    }

    public void saveFile(){
        events.notify("save", this.file);
    }

    public EventManager getEvents() {
        return events;
    }
}
