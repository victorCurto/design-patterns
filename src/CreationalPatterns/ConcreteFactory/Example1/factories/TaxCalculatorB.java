package CreationalPatterns.ConcreteFactory.Example1.factories;

public class TaxCalculatorB implements ITaxCalculatorAdapter {
    @Override
    public int getPercentageTax() {
        return 20;
    }
}
