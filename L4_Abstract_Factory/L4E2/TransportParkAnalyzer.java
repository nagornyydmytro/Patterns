package L4_Abstract_Factory.L4E2;

public class TransportParkAnalyzer {

    public long calculateTotalCost(TransportFactory factory, int busesCount, int tramsCount, int trolleybusesCount, int mileage) {
        long total = 0;

        for (int i = 0; i < busesCount; i++) {
            Bus bus = factory.createBus();
            total += bus.getCost() + (long) bus.getUsageCost() * mileage;
        }

        for (int i = 0; i < tramsCount; i++) {
            Tram tram = factory.createTram();
            total += tram.getCost() + (long) tram.getUsageCost() * mileage;
        }

        for (int i = 0; i < trolleybusesCount; i++) {
            Trolleybus trolleybus = factory.createTrolleybus();
            total += trolleybus.getCost() + (long) trolleybus.getUsageCost() * mileage;
        }

        return total;
    }

    public void printReport(TransportFactory factory, int busesCount, int tramsCount, int trolleybusesCount, int mileage) {
        long total = calculateTotalCost(factory, busesCount, tramsCount, trolleybusesCount, mileage);

        System.out.println("===== " + factory.getBrandName() + " =====");
        System.out.println("Bus: " + factory.createBus());
        System.out.println("Tram: " + factory.createTram());
        System.out.println("Trolleybus: " + factory.createTrolleybus());
        System.out.println("Order:");
        System.out.println("  Buses: " + busesCount);
        System.out.println("  Trams: " + tramsCount);
        System.out.println("  Trolleybuses: " + trolleybusesCount);
        System.out.println("  Mileage: " + mileage + " km");
        System.out.println("Total contract cost: " + total);
        System.out.println();
    }
}