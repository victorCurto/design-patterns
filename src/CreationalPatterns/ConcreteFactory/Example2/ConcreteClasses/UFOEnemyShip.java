package CreationalPatterns.ConcreteFactory.Example2.ConcreteClasses;

import CreationalPatterns.ConcreteFactory.Example2.AbstractTypes.EnemyShip;

public class UFOEnemyShip extends EnemyShip {

    public UFOEnemyShip(){
        setName("UFO Enemy Ship");
        setAmtDamage(20.0);
    }
}
