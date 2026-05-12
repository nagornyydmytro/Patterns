package L5_Builder.L5E1.src;

public class TransmissionBuilder {
    private Transmission.Type type;
    private int gears;

    public TransmissionBuilder setType(Transmission.Type type) {
        this.type = type;
        return this;
    }

    public TransmissionBuilder setGears(int gears) {
        this.gears = gears;
        return this;
    }

    public Transmission build() {
        return new Transmission(type, gears);
    }
}
