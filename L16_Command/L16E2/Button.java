package L16_Command.L16E2;

public class Button {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        if (command != null) {
            command.execute();
        }
    }
}