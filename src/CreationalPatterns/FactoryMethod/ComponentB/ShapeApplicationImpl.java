package CreationalPatterns.FactoryMethod.ComponentB;

import CreationalPatterns.FactoryMethod.ComponentApp.AbstractShapeApplication;
import CreationalPatterns.FactoryMethod.ComponentApp.IShape;

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
