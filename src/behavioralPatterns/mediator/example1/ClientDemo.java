package behavioralPatterns.mediator.example1;

import behavioralPatterns.mediator.example1.components.*;
import behavioralPatterns.mediator.example1.mediator.Editor;
import behavioralPatterns.mediator.example1.mediator.Mediator;

import javax.swing.*;

public class ClientDemo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}