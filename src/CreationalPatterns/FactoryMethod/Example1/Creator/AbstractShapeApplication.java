package CreationalPatterns.FactoryMethod.Example1.Creator;

import CreationalPatterns.FactoryMethod.Example1.Products.IShape;

public abstract class AbstractShapeApplication {

    public void runShapeApplication(){
        IShape shape = make();
        System.out.println(shape.draw());

    }

    protected abstract IShape make();
}
