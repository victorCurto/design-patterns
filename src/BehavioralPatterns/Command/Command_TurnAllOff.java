package BehavioralPatterns.Command;

import java.util.List;

public class Command_TurnAllOff implements ICommand {

    List<IElectronicDevice> theDevices;

    public Command_TurnAllOff(List<IElectronicDevice> newDevices){
        theDevices = newDevices;
    }

    @Override
    public void execute() {
        for(IElectronicDevice device: theDevices)
            device.off();
    }

    @Override
    public void undo() {
        for(IElectronicDevice device: theDevices)
            device.on();
    }
}
