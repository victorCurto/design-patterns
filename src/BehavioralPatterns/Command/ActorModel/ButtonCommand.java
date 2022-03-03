package BehavioralPatterns.Command.ActorModel;

public class ButtonCommand implements Command {

    private final int buttonAddr;
    private final Command onPress_LightCommand;

    public ButtonCommand(int buttonAddr, Command onPress) {
        this.buttonAddr = buttonAddr;
        this.onPress_LightCommand = onPress;
    }

    @Override
    public void execute() {
        Commands.add(buttonHasBeenPressed() ? onPress_LightCommand : this);
    }

    private boolean buttonHasBeenPressed() {
        return (IO.in(this.buttonAddr)== 0);
    }

    @Override
    public String toString() {
        return "ButtonCommand{ buttonAddr=" + buttonAddr + ", onPress=" + onPress_LightCommand + '}';
    }
}
