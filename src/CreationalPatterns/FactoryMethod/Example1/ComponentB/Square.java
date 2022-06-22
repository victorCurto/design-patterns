package CreationalPatterns.FactoryMethod.Example1.ComponentB;

import CreationalPatterns.FactoryMethod.Example1.ComponentApp.IShape;

public class Square implements IShape {

    @Override
    public String draw() {
        return "Draw a Square";
    }
}
