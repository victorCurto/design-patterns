package CreationalPatterns.AbstractFactory.Example1.ConcreteClassesManufactores.Manufactor1;

public class CashDrawer implements CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICashDrawer {

    @Override
    public boolean idDrawerOpened() {
        return false;
    }

    @Override
    public boolean idDrawerClose() {
        return false;
    }
}
