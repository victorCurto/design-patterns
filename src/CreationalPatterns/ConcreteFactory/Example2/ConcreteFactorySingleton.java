package CreationalPatterns.ConcreteFactory.Example2;

import CreationalPatterns.ConcreteFactory.Example2.TypesOfObjects.EnemyShip;
import CreationalPatterns.ConcreteFactory.Example2.ConcreteClasses.BigUFOEnemyShip;
import CreationalPatterns.ConcreteFactory.Example2.ConcreteClasses.RocketEnemyShip;
import CreationalPatterns.ConcreteFactory.Example2.ConcreteClasses.UFOEnemyShip;

public class ConcreteFactorySingleton {

    private static EnemyShip ufoEnemyShip;
    private static EnemyShip rocketEnemyShip;
    private static EnemyShip bigufoEnemyShip;

    public static EnemyShip makeEnemyShip(String newShipType){
        switch (newShipType) {
            case "U":
                if (ufoEnemyShip == null)
                    ufoEnemyShip = new UFOEnemyShip();
                return ufoEnemyShip;
            case "R":
                if (rocketEnemyShip == null)
                    rocketEnemyShip = new RocketEnemyShip();
                return rocketEnemyShip;
            case "B":
                if (bigufoEnemyShip == null)
                    bigufoEnemyShip = new BigUFOEnemyShip();
                return bigufoEnemyShip;
            default:
                return null;
        }
    }
}
