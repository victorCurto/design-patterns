package behavioralPatterns.command.example1;

public class Device_Radio implements IElectronicDevice {
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Radio is ON");
    }

    @Override
    public void off() {
        System.out.println("Radio is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio volume is at "+volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio volume is at "+volume);
    }
}
