public class CarSimulator {

    private final CarBuilder carBuilder = new CarBuilder();

    public static void main(String[] args) {
        CarSimulator simulator = new CarSimulator();

        Wheel wheel = new Wheel();

        Car car = simulator.carBuilder.buildCar(wheel);

        System.out.println(car);
    }
}