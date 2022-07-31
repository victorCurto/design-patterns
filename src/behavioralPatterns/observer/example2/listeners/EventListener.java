package behavioralPatterns.observer.example2.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}