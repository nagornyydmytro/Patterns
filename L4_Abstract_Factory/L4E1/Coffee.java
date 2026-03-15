package L4_Abstract_Factory.L4E1;

public abstract class Coffee {
    protected String name;
    protected double costPrice;
    protected double salePrice;

    public String getName() {
        return name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getProfit() {
        return salePrice - costPrice;
    }

    @Override
    public String toString() {
        return name + " (cost=" + costPrice + ", sale=" + salePrice + ", profit=" + getProfit() + ")";
    }
}