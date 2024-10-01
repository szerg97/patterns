package com.szalai.patterns.behavioral.observer;

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener("/path/to/file", "Someone has opened the file: %s");
        EmailAlertsListener mailer = new EmailAlertsListener("asd@asd.com", "Alerting %s, someone has changed the file: %s");

        editor.getEvents().subscribe("open", logger);
        editor.getEvents().subscribe("save", mailer);

        editor.openFile("timesheet.xlsx");
        editor.saveFile();

        editor.openFile("core.txt");
        editor.saveFile();

        editor.getEvents().unsubscribe("open", logger);
        editor.getEvents().unsubscribe("save", mailer);

        editor.openFile("should_not_notify.txt");
        editor.saveFile();
    }
}
