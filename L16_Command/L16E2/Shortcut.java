package L16_Command.L16E2;

public class Shortcut {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        if (command != null) {
            command.execute();
        }
    }
}