package CreationalPatterns.FactoryMethod.Example1;

import CreationalPatterns.FactoryMethod.Example1.ComponentApp.AbstractShapeApplication;
import CreationalPatterns.FactoryMethod.Example1.ComponentB.ShapeApplicationImpl;

public class ShapeApplicationMain {

    public static void main(String [] args){
        AbstractShapeApplication app = new ShapeApplicationImpl();

        app.runShapeApplication();
    }
}
