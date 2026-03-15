package L3_Factory_Method.L3E1;

public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new MechMatMallCoffeeShop();

        CoffeeType[] orders = {
                CoffeeType.ESPRESSO,
                CoffeeType.AMERICANO,
                CoffeeType.CAPPUCCINO,
                CoffeeType.LATTE,
                CoffeeType.FILTER,
                CoffeeType.FLAT_WHITE,
                CoffeeType.ESPRESSO,
                CoffeeType.CAPPUCCINO,
                CoffeeType.V_60,
        };

        double totalProfit = 0.0;

        for (CoffeeType type : orders) {
            Coffee coffee = shop.orderCoffee(type);
            totalProfit += coffee.getProfit();

            System.out.println(
                    coffee.getName()
                            + ": cost = " + coffee.getCostPrice()
                            + ", sale = " + coffee.getSalePrice()
                            + ", profit = " + coffee.getProfit()
            );
            System.out.println();
        }

        System.out.println("Total profit: " + totalProfit);
    }
}