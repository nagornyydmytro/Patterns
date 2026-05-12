package L9_Bridge.L9E1;

public abstract class Coffee extends Beverage {
    public Coffee(int sugar, ServingType servingType) {
        super(sugar, servingType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
    }

    @Override
    public int cost() {
        return 10 + servingType.packagingCost();
    }
}