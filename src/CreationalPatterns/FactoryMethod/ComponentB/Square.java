package CreationalPatterns.FactoryMethod.ComponentB;

import CreationalPatterns.FactoryMethod.ComponentApp.IShape;

public class Square implements IShape {

    @Override
    public String draw() {
        return "Draw a Square";
    }
}
