package CreationalPatterns.prototype.example1;

public class ShapeApplicationUsingPrototype {
    public void runShapeApplication() throws Exception {
        IShape myCircle = (IShape) ShapePrototypes.circlePrototype.clone();
        System.out.println(myCircle.draw());
        ((Circle) myCircle).setDiameter(5);

        IShape mySquare = (IShape) ShapePrototypes.squarePrototype.clone();
        System.out.println(mySquare.draw());
        ((Square) mySquare).setSide(2);
    }
}
