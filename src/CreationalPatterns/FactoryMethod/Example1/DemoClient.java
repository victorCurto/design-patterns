package CreationalPatterns.FactoryMethod.Example1;

import CreationalPatterns.FactoryMethod.Example1.Creator.AbstractShapeApplication;
import CreationalPatterns.FactoryMethod.Example1.Creator.ShapeApplicationCircle;
import CreationalPatterns.FactoryMethod.Example1.Creator.ShapeApplicationSquare;

public class DemoClient {

    public static void main(String [] args){
        AbstractShapeApplication app = new ShapeApplicationCircle();
        app.runShapeApplication();

        app = new ShapeApplicationSquare();
        app.runShapeApplication();
    }
}
