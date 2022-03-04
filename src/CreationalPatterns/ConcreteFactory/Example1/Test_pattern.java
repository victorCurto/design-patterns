package CreationalPatterns.ConcreteFactory.Example1;

import CreationalPatterns.ConcreteFactory.Example1.TypesOfAdapter.ITaxCalculatorAdapter;

public class Test_pattern {

    public static void main(String[] args) {

        ITaxCalculatorAdapter taxCalculatorAdapter = ServicesFactorySingleton.getTaxCalculatorAdapter();

        System.out.println("Applied tax percentage: "+taxCalculatorAdapter.getPercentageTax());

    }
}
