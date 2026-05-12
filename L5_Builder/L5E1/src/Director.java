package L5_Builder.L5E1.src;

public class Director {

    public Car buildSedan() {
        Engine engine = new EngineBuilder()
                .setPower(105)
                .setTorque(140)
                .setFuel(Engine.Fuel.Petrol)
                .setVolume(1.4f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Manual)
                .setGears(5)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Steel)
                .setDiameter(14)
                .build();

        Tire tire = new TireBuilder()
                .setWidth(185)
                .setProfile(65)
                .setSeason(Tire.Season.Summer)
                .build();

        return new CarBuilder()
                .setType(Car.Type.Sedan)
                .setCarColor(Car.CarColor.White)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .setTire(tire)
                .build();
    }

    public Car buildSUV() {
        Engine engine = new EngineBuilder()
                .setPower(180)
                .setTorque(320)
                .setFuel(Engine.Fuel.Diesel)
                .setVolume(2.0f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Automatic)
                .setGears(8)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(18)
                .build();

        Tire tire = new TireBuilder()
                .setWidth(255)
                .setProfile(55)
                .setSeason(Tire.Season.AllSeason)
                .build();

        return new CarBuilder()
                .setType(Car.Type.SUV)
                .setCarColor(Car.CarColor.Black)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .setTire(tire)
                .build();
    }

    public Car buildHatchback() {
        Engine engine = new EngineBuilder()
                .setPower(90)
                .setTorque(120)
                .setFuel(Engine.Fuel.Petrol)
                .setVolume(1.2f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Manual)
                .setGears(5)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(15)
                .build();

        Tire tire = new TireBuilder()
                .setWidth(195)
                .setProfile(55)
                .setSeason(Tire.Season.Winter)
                .build();

        return new CarBuilder()
                .setType(Car.Type.Hatchback)
                .setCarColor(Car.CarColor.Red)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .setTire(tire)
                .build();
    }
}