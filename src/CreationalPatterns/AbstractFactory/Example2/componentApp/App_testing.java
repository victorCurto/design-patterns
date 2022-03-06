package CreationalPatterns.AbstractFactory.Example2.componentApp;

import CreationalPatterns.AbstractFactory.Example1.JavaPOSDeviceFactorySingleton;
import CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICoinDispenser;
import CreationalPatterns.AbstractFactory.Example2.componentB.RectangularShapeFactory;

public class App_testing {

    public static void main(String [] args){

        IShapeFactory shapeFactory = RectangularShapeFactory.getInstance();

        IShape shapeA = shapeFactory.make("circle");

        System.out.println(shapeA.draw());
    }
}
