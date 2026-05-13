package L16_Command.L16E3;

public class DeviceVolumeUpCommand implements Command {

    private final Device device;

    public DeviceVolumeUpCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
}