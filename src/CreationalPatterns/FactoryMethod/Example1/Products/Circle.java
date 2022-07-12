package CreationalPatterns.FactoryMethod.Example1.Products;

public class Circle implements IShape {
    @Override
    public String draw() {
        return "Draw a CIRCLE";
    }
}
