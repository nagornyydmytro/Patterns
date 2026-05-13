package L23_Visitor.L23E1;

public class PenaltyVisitor implements EmployeeVisitor {

    private final int penalty;

    public PenaltyVisitor(int penalty) {
        this.penalty = penalty;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(applyPenalty(manager.getSalary()));
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(applyPenalty(salesPerson.getSalary()));
    }

    @Override
    public void visit(ITSupport itSupport) {
        itSupport.setSalary(applyPenalty(itSupport.getSalary()));
    }

    private int applyPenalty(int salary) {
        return Math.max(0, salary - penalty);
    }

}