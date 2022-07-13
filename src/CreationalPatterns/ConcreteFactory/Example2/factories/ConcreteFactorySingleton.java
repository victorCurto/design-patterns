package CreationalPatterns.ConcreteFactory.Example2.factories;

import CreationalPatterns.ConcreteFactory.Example2.factories.EnemyShip;
import CreationalPatterns.ConcreteFactory.Example2.factories.BigUFOEnemyShip;
import CreationalPatterns.ConcreteFactory.Example2.factories.RocketEnemyShip;
import CreationalPatterns.ConcreteFactory.Example2.factories.UFOEnemyShip;

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
