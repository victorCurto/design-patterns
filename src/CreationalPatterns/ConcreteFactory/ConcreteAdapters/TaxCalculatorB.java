package CreationalPatterns.ConcreteFactory.ConcreteAdapters;

import CreationalPatterns.ConcreteFactory.TypesOfAdapter.ITaxCalculatorAdapter;

public class TaxCalculatorB implements ITaxCalculatorAdapter {
    @Override
    public int getPercentageTax() {
        return 20;
    }
}
