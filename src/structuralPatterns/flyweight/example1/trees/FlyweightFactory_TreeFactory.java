package structuralPatterns.flyweight.example1.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory_TreeFactory {
    static Map<String, Flyweight_TreeType> treeTypes = new HashMap<>();

    public static Flyweight_TreeType getTreeType(String name, Color color, String otherTreeData) {
        Flyweight_TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new Flyweight_TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
