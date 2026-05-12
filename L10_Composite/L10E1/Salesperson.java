package L10_Composite.L10E1;

public class Salesperson implements Payable {

  private final String name;
  private final int salary;

  private final Manager manager;

  public Salesperson(String name, int salary, Manager manager) {
    this.name = name;
    this.salary = salary;
    this.manager = manager;
  }

  @Override
  public void payExpenses() {
    System.out.println(name + " has been paid $" + salary);
  }

}