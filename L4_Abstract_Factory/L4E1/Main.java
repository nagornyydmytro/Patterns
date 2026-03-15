package L4_Abstract_Factory.L4E1;

public class Main {
    public static void main(String[] args) {
        CoffeeShopAnalyzer analyzer = new CoffeeShopAnalyzer();

        int days = 30;

        int espressoCount = 20;
        int americanoCount = 25;
        int cappuccinoCount = 18;
        int latteCount = 15;
        int flatWhiteCount = 12;
        int filterCoffeeCount = 10;
        int v60Count = 8;

        CoffeeFactory laMarzoccoFactory = new LaMarzoccoCoffeeFactory();
        CoffeeFactory laSpazialeFactory = new LaSpazialeCoffeeFactory();

        analyzer.printReport(
                "La Marzocco",
                laMarzoccoFactory,
                days,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount,
                flatWhiteCount,
                filterCoffeeCount,
                v60Count
        );

        analyzer.printReport(
                "La Spaziale",
                laSpazialeFactory,
                days,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount,
                flatWhiteCount,
                filterCoffeeCount,
                v60Count
        );

        double laMarzoccoProfit = analyzer.calculateNetProfit(
                laMarzoccoFactory,
                days,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount,
                flatWhiteCount,
                filterCoffeeCount,
                v60Count
        );

        double laSpazialeProfit = analyzer.calculateNetProfit(
                laSpazialeFactory,
                days,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount,
                flatWhiteCount,
                filterCoffeeCount,
                v60Count
        );

        if (laMarzoccoProfit > laSpazialeProfit) {
            System.out.println("Better choice: La Marzocco");
        } else if (laSpazialeProfit > laMarzoccoProfit) {
            System.out.println("Better choice: La Spaziale");
        } else {
            System.out.println("Both options are equally profitable.");
        }
    }
}