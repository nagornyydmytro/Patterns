package L16_Command.L16E3;

public class DevicePrevChanelCommand implements Command {

    private final Device device;

    public DevicePrevChanelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.prevChanel();
    }
}