package CreationalPatterns.AbstractFactory.Example1.ConcreteClassesManufactores.Manufactor2;

public class CashDrawer implements CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICashDrawer {
    @Override
    public boolean idDrawerOpened() {
        return true;
    }

    @Override
    public boolean idDrawerClose() {
        return true;
    }
}
