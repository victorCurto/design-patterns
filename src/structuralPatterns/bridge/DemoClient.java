package structuralPatterns.bridge;

import structuralPatterns.bridge.abstraction.AdvancedRemote;
import structuralPatterns.bridge.abstraction.BasicRemote;
import structuralPatterns.bridge.implementation.Device;
import structuralPatterns.bridge.implementation.Radio;
import structuralPatterns.bridge.implementation.Tv;

public class DemoClient {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}