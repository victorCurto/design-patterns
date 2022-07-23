package structuralPatterns.flyweight.example1.forest;

import structuralPatterns.flyweight.example1.trees.Context_Tree;
import structuralPatterns.flyweight.example1.trees.FlyweightFactory_TreeFactory;
import structuralPatterns.flyweight.example1.trees.Flyweight_TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client_Forest extends JFrame {
    private List<Context_Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        Flyweight_TreeType type = FlyweightFactory_TreeFactory.getTreeType(name, color, otherTreeData);
        Context_Tree tree = new Context_Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Context_Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}

