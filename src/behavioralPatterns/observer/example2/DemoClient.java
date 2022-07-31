package behavioralPatterns.observer.example2;

import behavioralPatterns.observer.example2.editor.Editor;
import behavioralPatterns.observer.example2.listeners.EmailNotificationListener;
import behavioralPatterns.observer.example2.listeners.LogOpenListener;

public class DemoClient {
    public static void main(String[] args) {
        Editor editor = new Editor();
        //add the subscribers
        editor.subscribersEvents.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.subscribersEvents.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
