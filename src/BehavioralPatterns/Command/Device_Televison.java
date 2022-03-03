package BehavioralPatterns.Command;

public class Device_Televison implements IElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV is ON");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV volume is at "+volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV volume is at "+volume);
    }
}
