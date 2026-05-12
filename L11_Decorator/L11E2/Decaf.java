package L11_Decorator.L11E2;

public class Decaf extends Beverage {
    @Override
    public String description() {
        return "Decaf";
    }

    @Override
    public float cost() {
        return 0.50f;
    }
}