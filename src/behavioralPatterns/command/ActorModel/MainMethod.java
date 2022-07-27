package behavioralPatterns.command.ActorModel;

public class MainMethod {
    public static void main(String[] args) {
        /*
        List of Button commands - every button command has inside an LightCommand
         */
        Commands.add( new ButtonCommand(IO.BUTTON1_ADDRESS, new LightCommand(IO.LIGHT1_ADDRESS)));
        Commands.add( new ButtonCommand(IO.BUTTON2_ADDRESS, new LightCommand(IO.LIGHT2_ADDRESS)));
        Commands.add( new ButtonCommand(IO.BUTTON3_ADDRESS, new LightCommand(IO.LIGHT3_ADDRESS)));
        Commands.add( new ButtonCommand(IO.BUTTON4_ADDRESS, new LightCommand(IO.LIGHT4_ADDRESS)));
        Commands.add( new ButtonCommand(IO.BUTTON5_ADDRESS, new LightCommand(IO.LIGHT5_ADDRESS)));

        new Thread(() -> {
            while (Commands.size() != 0) {
                Command cmd = Commands.get(0);
                cmd.execute(); //if condition is true, add the new command to execute, if false add the same command (this)
                Commands.remove(0); //remove the executed command
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ignored) {}

            IO.addresses.put(IO.BUTTON5_ADDRESS, 0);

        }).start();
    }

}
