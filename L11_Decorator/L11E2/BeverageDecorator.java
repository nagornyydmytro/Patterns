package L11_Decorator.L11E2;

abstract public class BeverageDecorator extends Beverage {
    protected final Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}