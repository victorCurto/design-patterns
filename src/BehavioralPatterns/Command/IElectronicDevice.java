package BehavioralPatterns.Command;

//Recievers
public interface IElectronicDevice {
    public void on();
    public void off();
    public void volumeUp();
    public void volumeDown();
}
