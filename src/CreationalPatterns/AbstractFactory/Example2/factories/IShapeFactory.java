package CreationalPatterns.AbstractFactory.Example2.factories;

import CreationalPatterns.AbstractFactory.Example2.products.IShape;

public interface IShapeFactory {

    IShape make(String typeShape);

}
