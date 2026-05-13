package L16_Command.L16E3;

public class DeviceOnCommand implements Command {

    private final Device device;

    public DeviceOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}