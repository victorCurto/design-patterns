package CreationalPatterns.AbstractFactory.Example1;

import CreationalPatterns.AbstractFactory.Example1.ConcreteClassesManufactores.Manufactor2.CashDrawer;
import CreationalPatterns.AbstractFactory.Example1.ConcreteClassesManufactores.Manufactor2.CoinDispenser;
import CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICashDrawer;
import CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICoinDispenser;

//Concrete factory for manufactore 2
public class Manufactore2JavaPOSDeviceFactory extends JavaPOSDeviceFactorySingleton {

    @Override
    public ICashDrawer getNewCashDrawer() {
        return new CashDrawer();
    }

    @Override
    public ICoinDispenser getCoinDispenser() {
        return new CoinDispenser();
    }
}
