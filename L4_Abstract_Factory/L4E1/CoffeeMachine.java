package L4_Abstract_Factory.L4E1;

public abstract class CoffeeMachine {
    protected String brand;
    protected double machineCost;
    protected double maintenancePerDay;

    public String getBrand() {
        return brand;
    }

    public double getMachineCost() {
        return machineCost;
    }

    public double getMaintenancePerDay() {
        return maintenancePerDay;
    }

    @Override
    public String toString() {
        return brand + " machine (cost=" + machineCost + ", maintenance/day=" + maintenancePerDay + ")";
    }
}