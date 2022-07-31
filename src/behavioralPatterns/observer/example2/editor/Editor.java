package behavioralPatterns.observer.example2.editor;

import behavioralPatterns.observer.example2.publisher.EventManager;

import java.io.File;

public class Editor {
    public EventManager subscribersEvents;
    private File file;

    public Editor() {
        this.subscribersEvents = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        subscribersEvents.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            subscribersEvents.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}