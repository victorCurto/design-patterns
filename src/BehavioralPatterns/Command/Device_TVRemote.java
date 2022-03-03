package BehavioralPatterns.Command;

public class Device_TVRemote {
    public static IElectronicDevice getDevice(){
        return new Device_Televison();
    }
}
