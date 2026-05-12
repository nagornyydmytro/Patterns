package L8_Adapter.L8E2.src;

import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.TruckCalculator;

public class Main {

    public static void main(String[] args) {
        VehicleCalculatorCustomsAdapter carAdapter =
                new VehicleCalculatorCustomsAdapter(new CarCalculator());

        VehicleCalculatorCustomsAdapter truckAdapter =
                new VehicleCalculatorCustomsAdapter(new TruckCalculator());

        System.out.println("=== Car customs adapter ===");
        printReport(
                carAdapter,
                new Auto(5, "Audi", true, 100000)
        );

        System.out.println();

        System.out.println("=== Truck customs adapter ===");
        printReport(
                truckAdapter,
                new Auto(7, "MAN", false, 250000)
        );
    }

    private static void printReport(VehicleCalculatorCustomsAdapter adapter, Auto auto) {
        float vehiclePrice = adapter.vehiclePrice(auto);
        float tax = adapter.tax(auto);
        float fullPrice = adapter.fullPrice(auto);

        System.out.println("Vehicle price (UAH): " + vehiclePrice);
        System.out.println("Tax (UAH): " + tax);
        System.out.println("Full price after customs (UAH): " + fullPrice);
    }
}