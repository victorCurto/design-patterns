package CreationalPatterns.ConcreteFactory.Example2;

import CreationalPatterns.ConcreteFactory.Example2.factories.ConcreteFactorySingleton;
import CreationalPatterns.ConcreteFactory.Example2.factories.EnemyShip;
import java.util.Scanner;

public class DemoMain {

    public static void main(String[] args){

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U / R / B)");

        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = ConcreteFactorySingleton.makeEnemyShip(typeOfShip);
        }
        if(theEnemy != null)
            doStuffEnemy(theEnemy);
        else
            System.out.println("Enter a U, R, or B next time");
    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
