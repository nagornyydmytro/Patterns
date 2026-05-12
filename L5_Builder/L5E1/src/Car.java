package L5_Builder.L5E1.src;

public class Car {
    public enum CarColor {   // Колір автомобіля
        White,  //  Білий
        Black,  //  Чорний
        Red,    //  Червоний
        Grey    //  Сірий
    }

    public enum Type {  //  Тип кузову автомобіля
        Sedan,      //  Седан
        Hatchback,  //  Хетчбек
        SUV         //  Кросовер
    }

    final private Type type;                  //  Тип кузову
    final private CarColor carColor;          //  Колір
    final private Engine engine;              //  Двигун
    final private Transmission transmission;  //  Трансмісія
    final private Wheel wheel;                //  Колеса

    public Car(Type type, CarColor carColor,
               Engine engine, Transmission transmission, Wheel wheel) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "type=" + type +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                ",\ntransmission=" + transmission +
                ",\nwheel=" + wheel +
                '\n';
    }
}