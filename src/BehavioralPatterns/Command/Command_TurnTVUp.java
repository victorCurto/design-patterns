package BehavioralPatterns.Command;

public class Command_TurnTVUp implements ICommand {

    IElectronicDevice theDevice;

    public Command_TurnTVUp(IElectronicDevice newDevice){
        theDevice= newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
