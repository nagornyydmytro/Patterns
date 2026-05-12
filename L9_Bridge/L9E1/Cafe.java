package L9_Bridge.L9E1;

public class Cafe {

    public static void main(String[] args) {
        ServingType inRestaurant = new InRestaurant();
        ServingType takeAway = new TakeAway();

        BlackChocolate blackChocolate = new BlackChocolate(3, 200, inRestaurant);
        BlackCoffee blackCoffee = new BlackCoffee(3, 200, true, takeAway);
        BlackTee blackTee = new BlackTee(0, 300, inRestaurant);

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTee);

        MilkChocolate milkChocolate = new MilkChocolate(3, 200, takeAway);
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(3, 200, inRestaurant);
        TeeWithMilk teeWithMilk = new TeeWithMilk(2, 300, takeAway);

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn%n", beverage.cost());
        beverage.drink();
    }

}