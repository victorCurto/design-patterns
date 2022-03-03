package CreationalPatterns.ConcreteFactory.ConcreteAdapters;

import CreationalPatterns.ConcreteFactory.TypesOfAdapter.ITaxCalculatorAdapter;

public class TaxCalculatorA implements ITaxCalculatorAdapter {
    @Override
    public int getPercentageTax() {
        return 10;
    }
}
