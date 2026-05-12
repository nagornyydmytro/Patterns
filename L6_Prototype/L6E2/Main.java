package L6_Prototype.L6E2;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(105, 140, Engine.Fuel.Petrol, 1.4f);
        Wheel wheel = new Wheel(Wheel.Material.Steel, 14);

        Car originalCar = new Car(Car.Type.Sedan, Car.CarColor.White, engine, wheel);
        Car clonedCar = originalCar.cloneCar();

        System.out.println("Original car:");
        System.out.println(originalCar);

        System.out.println("Cloned car:");
        System.out.println(clonedCar);
    }
}