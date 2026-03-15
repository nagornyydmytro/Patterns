package L3_Factory_Method.L3E1;

public class MechMatMallCoffeeShop extends CoffeeShop {

    @Override
    protected Coffee createCoffee(CoffeeType type) {
        switch (type) {
            case ESPRESSO:
                return new Espresso();
            case AMERICANO:
                return new Americano();
            case CAPPUCCINO:
                return new Cappuccino();
            case LATTE:
                return new Latte();
            case FILTER:
                return new Filter();
            case FLAT_WHITE:
                return new FlatWhite();
            case V_60:
                return new v60();
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}