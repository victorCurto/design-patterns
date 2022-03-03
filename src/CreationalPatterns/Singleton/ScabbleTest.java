package CreationalPatterns.Singleton;

import java.util.LinkedList;

public class ScabbleTest {

    public static void main(String [] args){

        Singleton_Lazy_Initialization newInstance = Singleton_Lazy_Initialization.getInstance();

        System.out.println("Instance 1 ID: "+ System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTitles(7);
        System.out.println("Player 1: "+playerOneTiles);

        System.out.println(newInstance.getLetterList());

        Singleton_Lazy_Initialization instanceTwo = Singleton_Lazy_Initialization.getInstance();
        System.out.println("Instance 2 ID: "+ System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerTwoTiles = newInstance.getTitles(7);
        System.out.println("Player 1: " + playerTwoTiles);

    }
}
