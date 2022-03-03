package BehavioralPatterns.Command.ActorModel;

import java.util.ArrayList;
import java.util.List;

public class Commands {

    private static final List<Command> commandList = new ArrayList<>();

    public static void add(Command command){
        commandList.add(command);
    }

    public static int size() {
        return commandList.size();
    }

    public static Command get(int i){
        return commandList.get(i);
    }

    public static void remove(int i){
        commandList.remove(i);
    }
}
