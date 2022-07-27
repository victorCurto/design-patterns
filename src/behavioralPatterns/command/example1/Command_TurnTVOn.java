package behavioralPatterns.command.example1;

public class Command_TurnTVOn implements ICommand {

    IElectronicDevice theDevice;

    public Command_TurnTVOn(IElectronicDevice newDevice){
        theDevice= newDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
