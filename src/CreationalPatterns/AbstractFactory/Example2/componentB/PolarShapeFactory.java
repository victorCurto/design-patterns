package CreationalPatterns.AbstractFactory.Example2.componentB;

import CreationalPatterns.AbstractFactory.Example2.componentApp.IShape;

public class PolarShapeFactory extends AbstractShapeFactory {

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
