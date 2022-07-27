package behavioralPatterns.command.example1;

public class Device_TVRemote {
    public static IElectronicDevice getDevice(){
        return new Device_Televison();
    }
}
