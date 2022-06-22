package CreationalPatterns.FactoryMethod.Example1.ComponentApp;

public abstract class AbstractShapeApplication {

    public void runShapeApplication(){
        IShape shape = make("circle");
        System.out.println(shape.draw());
        shape = make("square");
        System.out.println(shape.draw());
    }

    protected abstract IShape make(String typeShapre);
}
