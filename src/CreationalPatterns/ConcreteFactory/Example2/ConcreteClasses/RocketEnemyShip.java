package CreationalPatterns.ConcreteFactory.Example2.ConcreteClasses;

import CreationalPatterns.ConcreteFactory.Example2.TypesOfObjects.EnemyShip;

public class RocketEnemyShip extends EnemyShip {

    public RocketEnemyShip(){
        setName("Rocket Enemy Ship");
        setAmtDamage(10.0);
    }
}
