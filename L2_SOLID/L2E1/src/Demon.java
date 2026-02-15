package L2_SOLID.L2E1.src;
public class Demon {

    private final String level;

    public Demon(String level) {
        this.level = level;
    }

    public void shoot() {
        System.out.printf("Creature: %s, level %s, action: shoots\n", "Demon", level);
    }
}