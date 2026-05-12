package L10_Composite.L10E1;

public class Manager implements Payable {

    private final String name;
    private final int salary;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void payExpenses() {
        System.out.println(name + " has been paid $" + salary);
    }

}