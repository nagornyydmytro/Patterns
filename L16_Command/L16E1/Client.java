package L16_Command.L16E1;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Light kitchenLight = new Light("Kitchen");
        Light hallLight = new Light("Hall");
        Light bedroomLight = new Light("Bedroom");
        Light bathroomLight = new Light("Bathroom");

        Controller kitchenController = new Controller();
        Controller hallController = new Controller();
        Controller bedroomController = new Controller();
        Controller bathroomController = new Controller();
        Controller universalController = new Controller();

        kitchenController.setOnCommand(new LightOnCommand(kitchenLight));
        kitchenController.setOffCommand(new LightOffCommand(kitchenLight));

        hallController.setOnCommand(new LightOnCommand(hallLight));
        hallController.setOffCommand(new LightOffCommand(hallLight));

        bedroomController.setOnCommand(new LightOnCommand(bedroomLight));
        bedroomController.setOffCommand(new LightOffCommand(bedroomLight));

        bathroomController.setOnCommand(new LightOnCommand(bathroomLight));
        bathroomController.setOffCommand(new LightOffCommand(bathroomLight));

        List<Light> allLights = Arrays.asList(
                kitchenLight,
                hallLight,
                bedroomLight,
                bathroomLight
        );

        universalController.setOffCommand(new UniversalLightOffCommand(allLights));

        // Simulation
        kitchenController.on();
        hallController.on();
        bedroomController.on();

        hallController.off();

        bathroomController.on();
        hallController.on();

        System.out.println("--- Universal OFF ---");

        universalController.off();
    }
}