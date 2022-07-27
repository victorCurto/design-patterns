package behavioralPatterns.command.ActorModel;

import java.util.HashMap;
import java.util.Map;

public class IO {

    public static final int BUTTON1_ADDRESS = 0x01; // 1
    public static final int BUTTON2_ADDRESS = 0x02; // 2
    public static final int BUTTON3_ADDRESS = 0x03; // 3
    public static final int BUTTON4_ADDRESS = 0x04; // 4
    public static final int BUTTON5_ADDRESS = 0x05; // 5

    public static final int LIGHT1_ADDRESS = 11;
    public static final int LIGHT2_ADDRESS = 12;
    public static final int LIGHT3_ADDRESS = 13;
    public static final int LIGHT4_ADDRESS = 14;
    public static final int LIGHT5_ADDRESS = 15;

    public static final Map<Integer, Integer> addresses = new HashMap<>();

    static {
        /*
        * 0 - pressed
        * 1 - not pressed
        */
        addresses.put(BUTTON1_ADDRESS, 0);
        addresses.put(BUTTON2_ADDRESS, 0);
        addresses.put(BUTTON3_ADDRESS, 0);
        addresses.put(BUTTON4_ADDRESS, 0);
        addresses.put(BUTTON5_ADDRESS, 1); //not pressed button
    }

    public static int in(int ioAddress) {
        return addresses.get(ioAddress);
    }

    public static void out(int ioAddress, int data) {
        addresses.put(ioAddress, data);
    }
}

