package L16_Command.L16E3;

import java.util.Arrays;
import java.util.List;

public class TVSimulator {
    public static void main(String[] args) {

        Device tv = new Television();
        Device radio = new Radio();

        RemoteController tvController = new RemoteController();
        RemoteController radioController = new RemoteController();
        RemoteController universalController = new RemoteController();

        tvController.setOnCommand(new DeviceOnCommand(tv));
        tvController.setOffCommand(new DeviceOffCommand(tv));
        tvController.setVolumeUpCommand(new DeviceVolumeUpCommand(tv));
        tvController.setVolumeDownCommand(new DeviceVolumeDownCommand(tv));
        tvController.setNextChanelCommand(new DeviceNextChanelCommand(tv));
        tvController.setPrevChanelCommand(new DevicePrevChanelCommand(tv));

        radioController.setOnCommand(new DeviceOnCommand(radio));
        radioController.setOffCommand(new DeviceOffCommand(radio));
        radioController.setVolumeUpCommand(new DeviceVolumeUpCommand(radio));
        radioController.setVolumeDownCommand(new DeviceVolumeDownCommand(radio));
        radioController.setNextChanelCommand(new DeviceNextChanelCommand(radio));
        radioController.setPrevChanelCommand(new DevicePrevChanelCommand(radio));

        List<Device> devices = Arrays.asList(tv, radio);
        universalController.setOffCommand(new AllDevicesOffCommand(devices));

        tvController.deviceOn();
        tvController.deviceNextChanel();
        tvController.deviceVolumeUp();
        tvController.devicePrevChanel();
        tvController.deviceVolumeDown();

        radioController.deviceOn();
        radioController.deviceNextChanel();
        radioController.deviceVolumeUp();

        System.out.println("--- Universal OFF ---");
        universalController.deviceOff();
    }
}