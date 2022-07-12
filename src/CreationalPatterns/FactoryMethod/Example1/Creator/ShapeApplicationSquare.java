package CreationalPatterns.FactoryMethod.Example1.Creator;

import CreationalPatterns.FactoryMethod.Example1.Products.IShape;
import CreationalPatterns.FactoryMethod.Example1.Products.Square;

public class ShapeApplicationSquare extends AbstractShapeApplication {

    @Override
    public IShape make() {
        return new Square();
    }
}
