package L16_Command.L16E3;

public class DeviceVolumeDownCommand implements Command {

    private final Device device;

    public DeviceVolumeDownCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}