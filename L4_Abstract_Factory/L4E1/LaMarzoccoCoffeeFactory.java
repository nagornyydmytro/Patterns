package L4_Abstract_Factory.L4E1;

public class LaMarzoccoCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createEspresso() {
        return new LaMarzoccoEspresso();
    }

    @Override
    public Coffee createAmericano() {
        return new LaMarzoccoAmericano();
    }

    @Override
    public Coffee createCappuccino() {
        return new LaMarzoccoCappuccino();
    }

    @Override
    public Coffee createLatte() {
        return new LaMarzoccoLatte();
    }

    @Override
    public Coffee createFlatWhite() {
        return new LaMarzoccoFlatWhite();
    }

    @Override
    public Coffee createFilter() {
        return new LaMarzoccoFilter();
    }

    @Override
    public Coffee createV60() {
        return new LaMarzoccoV60();
    }

    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new LaMarzoccoCoffeeMachine();
    }
}