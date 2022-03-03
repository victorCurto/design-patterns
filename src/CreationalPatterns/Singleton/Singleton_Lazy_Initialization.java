package CreationalPatterns.Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton_Lazy_Initialization {

    private static Singleton_Lazy_Initialization firstInstance = null;

    //Holds all mu scrabble letters in an array
    String [] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b",
            "b", "b", "b", "b", "b" ,"c" ,"c" ,"c" ,"c" ,"c" ,"c" ,"c","e" ,"e" ,"e" ,"e" ,"e" };

    private final LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    private Singleton_Lazy_Initialization(){}

    public static Singleton_Lazy_Initialization getInstance(){
        if(firstInstance == null)
            firstInstance = new Singleton_Lazy_Initialization(); //lazy instatiation
        Collections.shuffle(firstInstance.letterList);

        return firstInstance;
    }

    public LinkedList<String> getLetterList(){
        return firstInstance.letterList;
    }

    public LinkedList<String> getTitles(int howManyTiles){
        LinkedList<String> tilesToSend = new LinkedList<>();

        for(int i=0; i<= howManyTiles; i++)
            tilesToSend.add(firstInstance.letterList.remove(0));

        return tilesToSend;
    }
}
