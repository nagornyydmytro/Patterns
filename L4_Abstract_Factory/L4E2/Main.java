package L4_Abstract_Factory.L4E2;

public class Main {
    public static void main(String[] args) {
        final int A = 10;
        final int T = 5;
        final int Tr = 40;
        final int N = 200_000;

        TransportParkAnalyzer analyzer = new TransportParkAnalyzer();

        TransportFactory volvoFactory = new VolvoTransportFactory();
        TransportFactory skodaFactory = new SkodaTransportFactory();
        TransportFactory hyundaiFactory = new HyundaiTransportFactory();

        analyzer.printReport(volvoFactory, A, T, Tr, N);
        analyzer.printReport(skodaFactory, A, T, Tr, N);
        analyzer.printReport(hyundaiFactory, A, T, Tr, N);

        long volvoCost = analyzer.calculateTotalCost(volvoFactory, A, T, Tr, N);
        long skodaCost = analyzer.calculateTotalCost(skodaFactory, A, T, Tr, N);
        long hyundaiCost = analyzer.calculateTotalCost(hyundaiFactory, A, T, Tr, N);

        long minCost = Math.min(volvoCost, Math.min(skodaCost, hyundaiCost));

        System.out.println("Best manufacturer:");
        if (minCost == volvoCost) {
            System.out.println("Volvo");
        } else if (minCost == skodaCost) {
            System.out.println("Skoda");
        } else {
            System.out.println("Hyundai");
        }
    }
}