package L6_Prototype.L6E2;

public class Transmission {
    public enum Type {  // Тип трансмісії
        Manual,     // Механічна
        Automatic   // Автоматична
    }

    final private Type type;  // Тип трансмісії
    final private int gears;  // Кількість передач

    public Transmission(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public Transmission(Transmission other) {
        this.type = other.type;
        this.gears = other.gears;
    }

    public Transmission cloneTransmission() {
        return new Transmission(this);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", gears=" + gears +
                '}';
    }
}