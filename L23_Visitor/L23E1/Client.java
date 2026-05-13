package L23_Visitor.L23E1;

public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new ITSupport(45000));

        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.accept(new SalaryIncreaseVisitor(10));
        System.out.println("Total amount paid to staff after salary increase: " + staffList.getSalary());

        staffList.accept(new PenaltyVisitor(5000));
        System.out.println("Total amount paid to staff after penalty: " + staffList.getSalary());
    }

}