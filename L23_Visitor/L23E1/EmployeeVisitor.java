package L23_Visitor.L23E1;

public interface EmployeeVisitor {

    void visit(Manager manager);

    void visit(SalesPerson salesPerson);

    void visit(ITSupport itSupport);

}