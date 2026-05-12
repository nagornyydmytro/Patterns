package L13_Flyweight.L13E1;

import java.util.HashMap;
import java.util.Map;

public class WheelFactory {

    private static final Map<String, Wheel> wheels = new HashMap<>();

    public static Wheel getWheel(int diameter) {
        String key = String.valueOf(diameter);

        if (!wheels.containsKey(key)) {
            wheels.put(key, new Wheel(diameter));
            System.out.println("Creating new flyweight wheel: " + key);
        }

        return wheels.get(key);
    }
}