package behavioralPatterns.mediator.example1.components;

import behavioralPatterns.mediator.example1.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
