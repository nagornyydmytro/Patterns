package L16_Command.L16E1;

public class Controller {

    private Command onCommand;
    private Command offCommand;

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void on() {
        if (onCommand != null) {
            onCommand.execute();
        }
    }

    public void off() {
        if (offCommand != null) {
            offCommand.execute();
        }
    }
}