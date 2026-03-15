package L4_Abstract_Factory.L4E1;

public class CoffeeShopAnalyzer {

    public double calculateDailyProfit(CoffeeFactory factory,
                                       int espressoCount,
                                       int americanoCount,
                                       int cappuccinoCount,
                                       int latteCount,
                                       int flatWhiteCount,
                                       int filterCoffeeCount,
                                       int v60Count) {
        double total = 0.0;

        total += factory.createEspresso().getProfit() * espressoCount;
        total += factory.createAmericano().getProfit() * americanoCount;
        total += factory.createCappuccino().getProfit() * cappuccinoCount;
        total += factory.createLatte().getProfit() * latteCount;
        total += factory.createFlatWhite().getProfit() * flatWhiteCount;
        total += factory.createFilter().getProfit() * filterCoffeeCount;
        total += factory.createV60().getProfit() * v60Count;

        return total;
    }

    public double calculateNetProfit(CoffeeFactory factory,
                                     int days,
                                     int espressoCount,
                                     int americanoCount,
                                     int cappuccinoCount,
                                     int latteCount,
                                     int flatWhiteCount,
                                     int filterCoffeeCount,
                                     int v60Count) {
        CoffeeMachine machine = factory.createCoffeeMachine();
        double dailyProfit = calculateDailyProfit(
                factory,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount,
                flatWhiteCount,
                filterCoffeeCount,
                v60Count
        );

        return dailyProfit * days - machine.getMachineCost() - machine.getMaintenancePerDay() * days;
    }

    public void printReport(String title,
                            CoffeeFactory factory,
                            int days,
                            int espressoCount,
                            int americanoCount,
                            int cappuccinoCount,
                            int latteCount,
                            int flatWhiteCount,
                            int filterCoffeeCount,
                            int v60Count) {
        CoffeeMachine machine = factory.createCoffeeMachine();
        double dailyProfit = calculateDailyProfit(
                factory,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount,
                flatWhiteCount,
                filterCoffeeCount,
                v60Count
        );
        double netProfit = calculateNetProfit(
                factory,
                days,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount,
                flatWhiteCount,
                filterCoffeeCount,
                v60Count
        );

        System.out.println("===== " + title + " =====");
        System.out.println(machine);
        System.out.println("Drinks:");
        System.out.println("  " + factory.createEspresso());
        System.out.println("  " + factory.createAmericano());
        System.out.println("  " + factory.createCappuccino());
        System.out.println("  " + factory.createLatte());
        System.out.println("  " + factory.createFlatWhite());
        System.out.println("  " + factory.createFilter());
        System.out.println("  " + factory.createV60());
        System.out.println();

        System.out.println("Planned period: " + days + " days");
        System.out.println("Daily sales plan:");
        System.out.println("  Espresso: " + espressoCount);
        System.out.println("  Americano: " + americanoCount);
        System.out.println("  Cappuccino: " + cappuccinoCount);
        System.out.println("  Latte: " + latteCount);
        System.out.println("  Flat White: " + flatWhiteCount);
        System.out.println("  Filter Coffee: " + filterCoffeeCount);
        System.out.println("  V60: " + v60Count);
        System.out.println();

        System.out.println("Daily profit: " + dailyProfit);
        System.out.println("Net profit for " + days + " days: " + netProfit);

        if (netProfit >= 0) {
            System.out.println("Result: this option reaches profit in " + days + " days.");
        } else {
            System.out.println("Result: this option does not reach profit in " + days + " days.");
        }

        System.out.println();
    }
}