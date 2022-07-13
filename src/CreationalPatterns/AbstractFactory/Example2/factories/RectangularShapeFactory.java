package CreationalPatterns.AbstractFactory.Example2.factories;

import CreationalPatterns.AbstractFactory.Example2.products.IShape;
import CreationalPatterns.AbstractFactory.Example2.products.RectangularCircle;
import CreationalPatterns.AbstractFactory.Example2.products.RectangularSquare;

public class RectangularShapeFactory implements IShapeFactory {

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
