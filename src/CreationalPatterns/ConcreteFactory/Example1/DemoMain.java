package CreationalPatterns.ConcreteFactory.Example1;

import CreationalPatterns.ConcreteFactory.Example1.factories.ITaxCalculatorAdapter;
import CreationalPatterns.ConcreteFactory.Example1.factories.ServicesFactorySingleton;

public class DemoMain {

    public static void main(String[] args) {

        ITaxCalculatorAdapter taxCalculatorAdapter = ServicesFactorySingleton.getTaxCalculatorAdapter();

        System.out.println("Applied tax percentage: "+taxCalculatorAdapter.getPercentageTax());

    }
}
