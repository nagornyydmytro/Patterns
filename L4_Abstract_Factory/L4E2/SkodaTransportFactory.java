package L4_Abstract_Factory.L4E2;

public class SkodaTransportFactory implements TransportFactory {

    @Override
    public Bus createBus() {
        return new SkodaBus();
    }

    @Override
    public Tram createTram() {
        return new SkodaTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus();
    }

    @Override
    public String getBrandName() {
        return "Skoda";
    }
}