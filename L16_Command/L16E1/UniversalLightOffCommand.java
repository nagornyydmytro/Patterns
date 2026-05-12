package L16_Command.L16E1;

import java.util.List;

public class UniversalLightOffCommand implements Command {
    private final List<Light> lights;

    public UniversalLightOffCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            light.off();
        }
    }
}