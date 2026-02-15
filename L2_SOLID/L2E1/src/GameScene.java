package L2_SOLID.L2E1.src;
import java.util.ArrayList;
import java.util.List;

public class GameScene {

    private final String level;

    private final List<Demon> demons = new ArrayList<>();
    private final List<Imp> imps = new ArrayList<>();
    private final List<Zombie> zombies = new ArrayList<>();
    private final List<Cacodemon> cacodemons = new ArrayList<>();

    public GameScene(String level) {
        this.level = level;
    }

    public void addMonster(MonsterType type) {
        switch (type) {
            case ZOMBIE:
                zombies.add(new Zombie(level));
                break;
            case IMP:
                imps.add(new Imp(level));
                break;
            case DEMON:
                demons.add(new Demon(level));
                break;
            case CACODEMON:
                cacodemons.add(new Cacodemon(level));
                break;
            default:
                throw new IllegalStateException("Unexpected type: " + type);
        }
    }

    public void start() {
        for (Demon demon : demons) demon.shoot();
        for (Zombie zombie : zombies) zombie.shoot();
        for (Imp imp : imps) imp.shoot();
        for (Cacodemon c : cacodemons) c.shoot();
    }
}
