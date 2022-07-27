package behavioralPatterns.command.ActorModel;

import java.time.Instant;

public class LightCommand implements Command {

    private final int ioAddress;

    public LightCommand(int ioAddress) {

        this.ioAddress = ioAddress;
    }

    @Override
    public void execute() {
        IO.out(ioAddress, 1);
        System.out.println("Light On : " + Instant.now() + "( ioAddress: "+ ioAddress+")");
        System.out.println("------------------------------");
    }

    @Override
    public String toString() {
        return "LightCommand{ ioAddress= " + ioAddress + '}';
    }
}
