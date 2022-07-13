package CreationalPatterns.ConcreteFactory.Example1.factories;

public class TaxCalculatorA implements ITaxCalculatorAdapter {
    @Override
    public int getPercentageTax() {
        return 10;
    }
}
