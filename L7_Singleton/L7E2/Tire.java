package L7_Singleton.L7E2;

public class Tire {
    public enum Season {
        Summer,
        Winter,
        AllSeason
    }

    final private int width;
    final private int profile;
    final private Season season;

    public Tire(int width, int profile, Season season) {
        this.width = width;
        this.profile = profile;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "width=" + width +
                ", profile=" + profile +
                ", season=" + season +
                '}';
    }
}