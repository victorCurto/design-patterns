package CreationalPatterns.AbstractFactory.Example2.componentB;

import CreationalPatterns.AbstractFactory.Example2.componentApp.IShape;
import CreationalPatterns.AbstractFactory.Example2.componentApp.IShapeFactory;

public class RectangularShapeFactory extends AbstractShapeFactory {

    @Override
    public IShape make(String typeShape) {

        IShape shapeObject = null;

        if (typeShape.equals("circle")){
            shapeObject = new RectangularCircle();
        }
        else if (typeShape.equals("square")) {
            shapeObject = new RectangularSquare();
        }

        return shapeObject;
    }
}
