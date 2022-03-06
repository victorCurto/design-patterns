package CreationalPatterns.AbstractFactory.Example2.componentB;

import CreationalPatterns.AbstractFactory.Example2.componentApp.IShape;

public class RectangularCircle implements IShape {
    @Override
    public String draw() {
        return "Draw a CIRCLE";
    }
}
