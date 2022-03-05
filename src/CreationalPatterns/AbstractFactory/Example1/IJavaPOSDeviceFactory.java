package CreationalPatterns.AbstractFactory.Example1;


import CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICashDrawer;
import CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICoinDispenser;

//Applying UML and Patterns) chapter 36 - More Object Design with GoF patterns - Abstract Factory (pag 606 - 608)
//Factory Interface
public interface IJavaPOSDeviceFactory {

    ICashDrawer getNewCashDrawer();
    ICoinDispenser getCoinDispenser();
}
