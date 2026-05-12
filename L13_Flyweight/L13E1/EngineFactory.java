package L13_Flyweight.L13E1;

import java.util.HashMap;
import java.util.Map;

public class EngineFactory {

    private static final Map<String, Engine> engines = new HashMap<>();

    public static Engine getEngine(int power, Engine.Fuel fuel) {
        String key = power + "_" + fuel;

        if (!engines.containsKey(key)) {
            engines.put(key, new Engine(power, fuel));
            System.out.println("Creating new flyweight engine: " + key);
        }

        return engines.get(key);
    }
}