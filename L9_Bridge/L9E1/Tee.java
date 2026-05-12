package L9_Bridge.L9E1;

public abstract class Tee extends Beverage {
    public Tee(int sugar, ServingType servingType) {
        super(sugar, servingType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
    }

    @Override
    public int cost() {
        return 7 + servingType.packagingCost();
    }
}