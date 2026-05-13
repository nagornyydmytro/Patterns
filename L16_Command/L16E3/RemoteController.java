package L16_Command.L16E3;

public class RemoteController {

    private Command onCommand;
    private Command offCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChanelCommand;
    private Command prevChanelCommand;

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void setVolumeUpCommand(Command volumeUpCommand) {
        this.volumeUpCommand = volumeUpCommand;
    }

    public void setVolumeDownCommand(Command volumeDownCommand) {
        this.volumeDownCommand = volumeDownCommand;
    }

    public void setNextChanelCommand(Command nextChanelCommand) {
        this.nextChanelCommand = nextChanelCommand;
    }

    public void setPrevChanelCommand(Command prevChanelCommand) {
        this.prevChanelCommand = prevChanelCommand;
    }

    void deviceOn() {
        if (onCommand != null) {
            onCommand.execute();
        }
    }

    void deviceOff() {
        if (offCommand != null) {
            offCommand.execute();
        }
    }

    void deviceVolumeUp() {
        if (volumeUpCommand != null) {
            volumeUpCommand.execute();
        }
    }

    void deviceVolumeDown() {
        if (volumeDownCommand != null) {
            volumeDownCommand.execute();
        }
    }

    void deviceNextChanel() {
        if (nextChanelCommand != null) {
            nextChanelCommand.execute();
        }
    }

    void devicePrevChanel() {
        if (prevChanelCommand != null) {
            prevChanelCommand.execute();
        }
    }
}