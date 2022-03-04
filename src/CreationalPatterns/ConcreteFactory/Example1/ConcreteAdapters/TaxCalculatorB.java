package CreationalPatterns.ConcreteFactory.Example1.ConcreteAdapters;

import CreationalPatterns.ConcreteFactory.Example1.TypesOfAdapter.ITaxCalculatorAdapter;

public class TaxCalculatorB implements ITaxCalculatorAdapter {
    @Override
    public int getPercentageTax() {
        return 20;
    }
}
