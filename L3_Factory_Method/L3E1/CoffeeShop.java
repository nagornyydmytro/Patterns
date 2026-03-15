package L3_Factory_Method.L3E1;

public abstract class CoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);
        coffee.prepare();
        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);
}