package L6_Prototype.L6E2;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(105, 140, Engine.Fuel.Petrol, 1.4f);
        Transmission transmission = new Transmission(Transmission.Type.Manual, 5);
        Wheel wheel = new Wheel(Wheel.Material.Steel, 14);
        Tire tire = new Tire(185, 65, Tire.Season.Summer);

        Car originalCar = new Car(
                Car.Type.Sedan,
                Car.CarColor.White,
                engine,
                transmission,
                wheel,
                tire
        );

        Car clonedCar = originalCar.cloneCar();

        System.out.println("Original car:");
        System.out.println(originalCar);

        System.out.println("Cloned car:");
        System.out.println(clonedCar);
    }
}