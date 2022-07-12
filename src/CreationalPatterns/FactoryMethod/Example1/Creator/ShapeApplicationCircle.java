package CreationalPatterns.FactoryMethod.Example1.Creator;

import CreationalPatterns.FactoryMethod.Example1.Products.Circle;
import CreationalPatterns.FactoryMethod.Example1.Products.IShape;

public class ShapeApplicationCircle extends AbstractShapeApplication {

    @Override
    public IShape make() {
        return new Circle();
    }
}
