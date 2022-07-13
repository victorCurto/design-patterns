package CreationalPatterns.AbstractFactory.Example2;

import CreationalPatterns.AbstractFactory.Example2.factories.IShapeFactory;
import CreationalPatterns.AbstractFactory.Example2.factories.RectangularShapeFactory;
import CreationalPatterns.AbstractFactory.Example2.factories.ShapeFactorySingleton;
import CreationalPatterns.AbstractFactory.Example2.products.IShape;

public class DemoMain {

    public static void main(String [] args){

        //IShapeFactory shapeFactory = RectangularShapeFactory.getInstance();
        IShapeFactory shapeFactory = ShapeFactorySingleton.getInstance();

        IShape shapeA = shapeFactory.make("circle");

        System.out.println(shapeA.draw());
    }
}
