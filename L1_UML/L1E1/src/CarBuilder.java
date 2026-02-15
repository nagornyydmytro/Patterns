package L1_UML.L1E1.src;
public class CarBuilder {

    public Car buildCar(Wheel wheel) {
        Engine engine = new Engine();
        return new Car(engine, wheel);
    }
}