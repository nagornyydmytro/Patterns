package L16_Command.L16E3;

import java.util.List;

public class AllDevicesOffCommand implements Command {

    private final List<Device> devices;

    public AllDevicesOffCommand(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        for (Device device : devices) {
            device.off();
        }
    }
}