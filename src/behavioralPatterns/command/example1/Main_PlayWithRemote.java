package behavioralPatterns.command.example1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main_PlayWithRemote {
    public static void main(String [] args){

        LinkedList<ICommand> listCommands = new LinkedList<>();

        IElectronicDevice device = Device_TVRemote.getDevice();

        //----------------- BehavioralPatterns.Command - TV ON    -----------------
        Command_TurnTVOn onCommand = new Command_TurnTVOn(device);
        listCommands.addFirst(onCommand);//to enable the undo feature
        Invoker_Button onPressed = new Invoker_Button(onCommand);
        onPressed.press();

        //----------------- BehavioralPatterns.Command - TV OFF    -----------------
        Command_TurnTVOff offCommand = new Command_TurnTVOff(device);
        listCommands.addFirst(offCommand);
        onPressed = new Invoker_Button(offCommand);
        onPressed.press();

        //----------------- BehavioralPatterns.Command - TV UP    -----------------
        Command_TurnTVUp volUpCommand = new Command_TurnTVUp(device);
        listCommands.addFirst(volUpCommand);
        listCommands.addFirst(volUpCommand);
        listCommands.addFirst(volUpCommand);
        onPressed = new Invoker_Button(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //----------------- Create new Devices    -----------------
        IElectronicDevice theTV = new Device_Televison();
        IElectronicDevice theRadio = new Device_Radio();

        List<IElectronicDevice> allDevices = new ArrayList<>();
        allDevices.add(theTV);
        allDevices.add(theRadio);

        Command_TurnAllOff turnOffDevices = new Command_TurnAllOff(allDevices);
        Invoker_Button turnThemOff = new Invoker_Button(turnOffDevices);
        turnThemOff.press();

        //----------------- Tryng the undo feature     -----------------
        System.out.println("---------- UnDo feature ----------");
        turnThemOff.pressUndo();

        //Undo all the previous comands
        for(ICommand command: listCommands)
            command.undo();
    }
}
