package BehavioralPatterns.Command;

public class Command_TurnTVOff implements ICommand {

    IElectronicDevice theDevice;

    public Command_TurnTVOff(IElectronicDevice newDevice){
        theDevice= newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
