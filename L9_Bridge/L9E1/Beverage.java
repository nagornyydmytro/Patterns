package L9_Bridge.L9E1;

public abstract class Beverage {

    protected final int sugar;
    protected final ServingType servingType;

    public Beverage(int sugar, ServingType servingType) {
        this.sugar = sugar;
        this.servingType = servingType;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();
}