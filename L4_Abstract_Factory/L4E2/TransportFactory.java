package L4_Abstract_Factory.L4E2;

public interface TransportFactory {
    Bus createBus();
    Tram createTram();
    Trolleybus createTrolleybus();
    String getBrandName();
}