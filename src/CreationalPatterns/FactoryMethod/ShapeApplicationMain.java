package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.ComponentApp.AbstractShapeApplication;
import CreationalPatterns.FactoryMethod.ComponentB.ShapeApplicationImpl;

public class ShapeApplicationMain {
    public static void main(String [] args){
        AbstractShapeApplication app = new ShapeApplicationImpl();
        app.runShapeApplication();
    }
}
