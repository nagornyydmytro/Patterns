package L9_Bridge.L9E1;

public class MilkChocolate extends Chocolate {

    private final int milkVolume;

    public MilkChocolate(int sugar, int milkVolume, ServingType servingType) {
        super(sugar, servingType);
        this.milkVolume = milkVolume;
    }

    @Override
    public void drink() {
        servingType.serve("milk chocolate");
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.printf("Put some milk : %s ml...%n", milkVolume);
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        return super.cost() + (int) (milkVolume / 20.0);
    }
}