package L8_Adapter.L8E2.src;

import com.vehiclecalculator.Truck;
import com.vehiclecalculator.TruckCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class VehicleCalculatorCustomsAdapter implements Customs {
    private static final float USD_TO_UAH = 41.0f;
    private static final float TAX_RATE = 0.2f;

    private final VehicleCalculator calculator;

    public VehicleCalculatorCustomsAdapter(VehicleCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        calculator.setVehicle(convertToVehicle(auto));
        return parseUsd(calculator.calculatePrice()) * USD_TO_UAH;
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto) * TAX_RATE;
    }

    public float fullPrice(Auto auto) {
        return vehiclePrice(auto) + tax(auto);
    }

    private Vehicle convertToVehicle(Auto auto) {
        if (calculator instanceof TruckCalculator) {
            return new Truck(auto.age, auto.mileage);
        }

        float damage = auto.damaged ? 0.5f : 1.0f;
        return new Vehicle(auto.age, auto.model, damage, auto.mileage);
    }

    private float parseUsd(String value) {
        String number = value.replace("USD", "").trim();
        return Float.parseFloat(number);
    }
}