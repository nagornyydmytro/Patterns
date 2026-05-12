package L11_Decorator.L11E2;

public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.25f;
    }
}