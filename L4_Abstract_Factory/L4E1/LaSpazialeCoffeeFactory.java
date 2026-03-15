package L4_Abstract_Factory.L4E1;

public class LaSpazialeCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createEspresso() {
        return new LaSpazialeEspresso();
    }

    @Override
    public Coffee createAmericano() {
        return new LaSpazialeAmericano();
    }

    @Override
    public Coffee createCappuccino() {
        return new LaSpazialeCappuccino();
    }

    @Override
    public Coffee createLatte() {
        return new LaSpazialeLatte();
    }

    @Override
    public Coffee createFlatWhite() {
        return new LaSpazialeFlatWhite();
    }

    @Override
    public Coffee createFilter() {
        return new LaSpazialeFilter();
    }

    @Override
    public Coffee createV60() {
        return new LaSpazialeV60();
    }

    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new LaSpazialeCoffeeMachine();
    }
}