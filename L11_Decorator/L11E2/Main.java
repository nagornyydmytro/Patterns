package L11_Decorator.L11E2;

public class Main {

    public static void main(String[] args) {

        Beverage espressoWithTwoSugars = new Espresso();
        espressoWithTwoSugars = new SugarDecorator(espressoWithTwoSugars);
        espressoWithTwoSugars = new SugarDecorator(espressoWithTwoSugars);
        System.out.println(espressoWithTwoSugars);

        Beverage darkRoastWithCreamAndTwoSugars = new DarkRoast();
        darkRoastWithCreamAndTwoSugars = new CreamDecorator(darkRoastWithCreamAndTwoSugars);
        darkRoastWithCreamAndTwoSugars = new SugarDecorator(darkRoastWithCreamAndTwoSugars);
        darkRoastWithCreamAndTwoSugars = new SugarDecorator(darkRoastWithCreamAndTwoSugars);
        System.out.println(darkRoastWithCreamAndTwoSugars);

        Beverage darkRoastWithCremeAndSugar = new DarkRoast();
        darkRoastWithCremeAndSugar = new CremeDecorator(darkRoastWithCremeAndSugar);
        darkRoastWithCremeAndSugar = new SugarDecorator(darkRoastWithCremeAndSugar);
        System.out.println(darkRoastWithCremeAndSugar);

        Beverage decafWithMilkAndTwoSugars = new Decaf();
        decafWithMilkAndTwoSugars = new MilkDecorator(decafWithMilkAndTwoSugars);
        decafWithMilkAndTwoSugars = new SugarDecorator(decafWithMilkAndTwoSugars);
        decafWithMilkAndTwoSugars = new SugarDecorator(decafWithMilkAndTwoSugars);
        System.out.println(decafWithMilkAndTwoSugars);
    }
}