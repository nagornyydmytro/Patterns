package L2_SOLID.L2E1.src;
public class Zombie {

    private final String level;

    public Zombie(String level) {
        this.level = level;
    }

    public void shoot() {
        System.out.printf("Creature: %s, level %s, action: shoots\n", "Zombie", level);
    }

}