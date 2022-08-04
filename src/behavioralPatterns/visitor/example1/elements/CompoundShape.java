package behavioralPatterns.visitor.example1.elements;

import behavioralPatterns.visitor.example1.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Element {
    public int id;
    public List<Element> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Element shape) {
        children.add(shape);
    }
}