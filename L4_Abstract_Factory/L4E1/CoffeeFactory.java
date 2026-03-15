package L4_Abstract_Factory.L4E1;

public interface CoffeeFactory {
    Coffee createEspresso();
    Coffee createAmericano();
    Coffee createCappuccino();
    Coffee createLatte();
    Coffee createFlatWhite();
    Coffee createFilter();
    Coffee createV60();
    CoffeeMachine createCoffeeMachine();
}