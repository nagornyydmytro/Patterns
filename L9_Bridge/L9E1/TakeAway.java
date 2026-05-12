package L9_Bridge.L9E1;

public class TakeAway implements ServingType {

    @Override
    public void serve(String beverageName) {
        System.out.println("Take away " + beverageName + "!");
    }

    @Override
    public int packagingCost() {
        return 5;
    }
}