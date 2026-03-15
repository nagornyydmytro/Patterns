package L4_Abstract_Factory.L4E2;

public abstract class Bus {
    private final int cost;
    private final int usageCost;

    protected Bus(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public void goByWay() {
        System.out.println("Bus runs!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {cost=" + cost + ", usageCost=" + usageCost + "}";
    }
}