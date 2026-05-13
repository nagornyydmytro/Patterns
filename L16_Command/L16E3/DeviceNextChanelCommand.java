package L16_Command.L16E3;

public class DeviceNextChanelCommand implements Command {

    private final Device device;

    public DeviceNextChanelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.nextChanel();
    }
}