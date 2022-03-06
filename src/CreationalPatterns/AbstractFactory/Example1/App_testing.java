package CreationalPatterns.AbstractFactory.Example1;

import CreationalPatterns.AbstractFactory.Example1.TypesOfObjects.ICoinDispenser;

public class App_testing {

    public static void main(String [] args){

        ICoinDispenser coinDispenser = JavaPOSDeviceFactorySingleton.getInstance().getCoinDispenser();

        System.out.println(coinDispenser.dispenserMessage());
    }
}
