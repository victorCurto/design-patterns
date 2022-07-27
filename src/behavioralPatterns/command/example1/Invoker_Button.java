package behavioralPatterns.command.example1;

// IMPORTANT: The Invoker DeviceButton knows nothing - it doesn't know what device or command is being used !!!!
public class Invoker_Button {

    ICommand theCommand;

    public Invoker_Button(ICommand newCommand){
        theCommand= newCommand;
    }

    public void press(){
        theCommand.execute();
    }

    public void pressUndo(){
        theCommand.undo();
    }
}
