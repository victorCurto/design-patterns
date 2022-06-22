package CreationalPatterns.FactoryMethod.Example1.ComponentB;

import CreationalPatterns.FactoryMethod.Example1.ComponentApp.IShape;

public class Circle implements IShape {
    @Override
    public String draw() {
        return "Draw a CIRCLE";
    }
}
