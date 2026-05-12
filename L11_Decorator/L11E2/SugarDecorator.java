package L11_Decorator.L11E2;

public class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + sugar";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.10f;
    }
}