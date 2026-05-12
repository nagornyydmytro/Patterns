package L9_Bridge.L9E1;

public abstract class Chocolate extends Beverage {
    public Chocolate(int sugar, ServingType servingType) {
        super(sugar, servingType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
    }

    @Override
    public int cost() {
        return 15 + servingType.packagingCost();
    }
}