package L3_Factory_Method.L3E1.src;

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

    public void prepare() {
        System.out.println("Preparing " + name);
    }
}