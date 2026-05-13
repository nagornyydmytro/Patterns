package L23_Visitor.L23E1;

public class SalaryIncreaseVisitor implements EmployeeVisitor {

    private final int percent;

    public SalaryIncreaseVisitor(int percent) {
        this.percent = percent;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(increase(manager.getSalary()));
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(increase(salesPerson.getSalary()));
    }

    @Override
    public void visit(ITSupport itSupport) {
        itSupport.setSalary(increase(itSupport.getSalary()));
    }

    private int increase(int salary) {
        return salary + salary * percent / 100;
    }

}