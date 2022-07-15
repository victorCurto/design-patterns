package CreationalPatterns.prototype.example1;

public class ShapeApplicationMain {

    static {
        ShapePrototypes.circlePrototype = new Circle();
        ShapePrototypes.squarePrototype = new Square();
    }

    public static void main(String [] args) throws Exception {
        ShapeApplicationUsingPrototype app = new ShapeApplicationUsingPrototype();
        app.runShapeApplication();
    }
}
