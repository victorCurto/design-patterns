package behavioralPatterns.state.example1;

import behavioralPatterns.state.example1.ui.Player;
import behavioralPatterns.state.example1.ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
