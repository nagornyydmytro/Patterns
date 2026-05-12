package L5_Builder.L5E1.src;

public class TireBuilder {
    private int width;
    private int profile;
    private Tire.Season season;

    public TireBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public TireBuilder setProfile(int profile) {
        this.profile = profile;
        return this;
    }

    public TireBuilder setSeason(Tire.Season season) {
        this.season = season;
        return this;
    }

    public Tire build() {
        return new Tire(width, profile, season);
    }
}