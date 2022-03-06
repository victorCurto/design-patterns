package CreationalPatterns.FactoryMethod.ComponentB;

import CreationalPatterns.FactoryMethod.ComponentApp.IShape;

public class Circle implements IShape {
    @Override
    public String draw() {
        return "Draw a CIRCLE";
    }
}
