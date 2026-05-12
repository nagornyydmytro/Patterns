package L10_Composite.L10E1;

public class ExpensesClient {

  public static void main(String[] args) {
    Manager director = new Manager("Director", 2000);

    Manager meatManager = new Manager("Meat manager", 1200);
    Salesperson meatSeller1 = new Salesperson("Meat seller 1", 600, meatManager);
    Salesperson meatSeller2 = new Salesperson("Meat seller 2", 650, meatManager);
    Salesperson meatSeller3 = new Salesperson("Meat seller 3", 700, meatManager);

    SalesTeam meatDepartment = new SalesTeam();
    meatDepartment.addManager(meatManager);
    meatDepartment.addSalesperson(meatSeller1);
    meatDepartment.addSalesperson(meatSeller2);
    meatDepartment.addSalesperson(meatSeller3);

    Manager dairyManager = new Manager("Dairy manager", 1150);
    Salesperson dairySeller1 = new Salesperson("Dairy seller 1", 550, dairyManager);
    Salesperson dairySeller2 = new Salesperson("Dairy seller 2", 600, dairyManager);
    Salesperson dairySeller3 = new Salesperson("Dairy seller 3", 620, dairyManager);

    SalesTeam dairyDepartment = new SalesTeam();
    dairyDepartment.addManager(dairyManager);
    dairyDepartment.addSalesperson(dairySeller1);
    dairyDepartment.addSalesperson(dairySeller2);
    dairyDepartment.addSalesperson(dairySeller3);

    Manager confectioneryManager = new Manager("Confectionery manager", 1100);
    Salesperson confectionerySeller1 = new Salesperson("Confectionery seller 1", 500, confectioneryManager);
    Salesperson confectionerySeller2 = new Salesperson("Confectionery seller 2", 530, confectioneryManager);
    Salesperson confectionerySeller3 = new Salesperson("Confectionery seller 3", 560, confectioneryManager);

    SalesTeam confectioneryDepartment = new SalesTeam();
    confectioneryDepartment.addManager(confectioneryManager);
    confectioneryDepartment.addSalesperson(confectionerySeller1);
    confectioneryDepartment.addSalesperson(confectionerySeller2);
    confectioneryDepartment.addSalesperson(confectionerySeller3);

    SalesTeam supermarket = new SalesTeam();
    supermarket.addManager(director);
    supermarket.addTeam(meatDepartment);
    supermarket.addTeam(dairyDepartment);
    supermarket.addTeam(confectioneryDepartment);

    payEntity(director);
    payEntity(meatDepartment);
    payEntity(supermarket);
  }

  private static void payEntity(Payable payable) {
    System.out.println("Expenses have been requested");
    payable.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

}