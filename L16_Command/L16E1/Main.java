package L16_Command.L16E1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Light kitchenLight = new Light("Kitchen");
        Light bedroomLight = new Light("Bedroom");
        Light livingRoomLight = new Light("Living room");

        Command kitchenOn = new LightOnCommand(kitchenLight);
        Command bedroomOn = new LightOnCommand(bedroomLight);
        Command livingRoomOn = new LightOnCommand(livingRoomLight);

        List<Light> allLights = Arrays.asList(kitchenLight, bedroomLight, livingRoomLight);
        Command universalOff = new UniversalLightOffCommand(allLights);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(kitchenOn);
        remote.pressButton();

        remote.setCommand(bedroomOn);
        remote.pressButton();

        remote.setCommand(livingRoomOn);
        remote.pressButton();

        System.out.println("--- Universal OFF ---");

        remote.setCommand(universalOff);
        remote.pressButton();
    }
}