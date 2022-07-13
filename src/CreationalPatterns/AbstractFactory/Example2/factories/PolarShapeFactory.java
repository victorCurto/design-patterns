package CreationalPatterns.AbstractFactory.Example2.factories;

import CreationalPatterns.AbstractFactory.Example2.products.IShape;
import CreationalPatterns.AbstractFactory.Example2.products.PolarCircle;
import CreationalPatterns.AbstractFactory.Example2.products.PolarSquare;

public class PolarShapeFactory implements IShapeFactory {

    @Override
    public IShape make(String typeShape) {

        IShape shapeObject = null;

        if (typeShape.equals("circle")){
            shapeObject = new PolarCircle();
        }
        else if (typeShape.equals("square")) {
            shapeObject = new PolarSquare();
        }

        return shapeObject;
    }
}
