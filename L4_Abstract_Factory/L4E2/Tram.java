package L4_Abstract_Factory.L4E2;

public abstract class Tram {
    private final int cost;
    private final int usageCost;

    protected Tram(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public void goByRails() {
        System.out.println("Tram runs!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {cost=" + cost + ", usageCost=" + usageCost + "}";
    }
}