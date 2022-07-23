package structuralPatterns.flyweight.example1.trees;

import java.awt.*;

public class Context_Tree {
    private int x;
    private int y;
    private Flyweight_TreeType type;

    public Context_Tree(int x, int y, Flyweight_TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
