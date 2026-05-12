package L11_Decorator.L11E2;

public class DarkRoast extends Beverage {
    @Override
    public String description() {
        return "Dark Roast";
    }

    @Override
    public float cost() {
        return 1.0f;
    }
}