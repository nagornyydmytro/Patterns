package L4_Abstract_Factory.L4E2;

public class HyundaiTransportFactory implements TransportFactory {

    @Override
    public Bus createBus() {
        return new HyundaiBus();
    }

    @Override
    public Tram createTram() {
        return new HyundaiTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus();
    }

    @Override
    public String getBrandName() {
        return "Hyundai";
    }
}