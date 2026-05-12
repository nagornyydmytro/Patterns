package L11_Decorator.L11E2;

public class CreamDecorator extends BeverageDecorator {

    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + cream";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.30f;
    }
}