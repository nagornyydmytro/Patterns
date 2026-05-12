package L9_Bridge.L9E1;

public class InRestaurant implements ServingType {

    @Override
    public void serve(String beverageName) {
        System.out.println("Drink " + beverageName + " in restaurant!");
    }

    @Override
    public int packagingCost() {
        return 0;
    }
}