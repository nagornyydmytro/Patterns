package L6_Prototype.L6E2;

public class Tire {
    public enum Season {  // Сезонність гуми
        Summer,     // Літня
        Winter,     // Зимова
        AllSeason   // Всесезонна
    }

    final private int width;     // Ширина гуми
    final private int profile;   // Профіль гуми
    final private Season season; // Сезонність

    public Tire(int width, int profile, Season season) {
        this.width = width;
        this.profile = profile;
        this.season = season;
    }

    public Tire(Tire other) {
        this.width = other.width;
        this.profile = other.profile;
        this.season = other.season;
    }

    public Tire cloneTire() {
        return new Tire(this);
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