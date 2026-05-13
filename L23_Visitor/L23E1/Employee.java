package L23_Visitor.L23E1;

public interface Employee {

    int getSalary();

    void accept(EmployeeVisitor visitor);

}