package CreationalPatterns.FactoryMethod.Example1.ComponentB;

import CreationalPatterns.FactoryMethod.Example1.ComponentApp.AbstractShapeApplication;
import CreationalPatterns.FactoryMethod.Example1.ComponentApp.IShape;

public class ShapeApplicationImpl extends AbstractShapeApplication {

    public IShape make(String typeShape) {

        IShape shapeObject = null;

        if (typeShape.equals("circle")){
            shapeObject = new Circle();
        }
        else if (typeShape.equals("square")) {
            shapeObject = new Square();
        }
        return shapeObject;
    }
}
