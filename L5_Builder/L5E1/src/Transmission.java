package L5_Builder.L5E1.src;

public class Transmission {
    public enum Type {
        Manual,
        Automatic
    }

    final private Type type;
    final private int gears;

    public Transmission(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", gears=" + gears +
                '}';
    }
}
