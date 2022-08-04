package behavioralPatterns.visitor.example1.elements;

import behavioralPatterns.visitor.example1.visitor.Visitor;

public interface Element {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
