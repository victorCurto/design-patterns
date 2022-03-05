package CreationalPatterns.AbstractFactory.Example1.ConcreteClassesManufactores.Manufactor1;

import CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICoinDispenser;

public class CoinDispenser implements ICoinDispenser {

    @Override
    public String dispenserMessage() {
        return "Dispenser from Manufacture 1";
    }
}
