package CreationalPatterns.ConcreteFactory;

import CreationalPatterns.ConcreteFactory.TypesOfAdapter.ITaxCalculatorAdapter;

public class Test_pattern {

    public static void main(String[] args) {

        ITaxCalculatorAdapter taxCalculatorAdapter = ServicesFactorySingleton.getTaxCalculatorAdapter();

        System.out.println("Applied tax percentage: "+taxCalculatorAdapter.getPercentageTax());

    }
}
