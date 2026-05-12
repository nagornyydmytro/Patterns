package L10_Composite.L10E1;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payable {

    private final List<Payable> members = new ArrayList<>();

    void addManager(Manager manager) {
        members.add(manager);
    }

    void addSalesperson(Salesperson salesperson) {
        members.add(salesperson);
    }

    void addTeam(SalesTeam team) {
        members.add(team);
    }

    @Override
    public void payExpenses() {
        for (Payable member : members) {
            member.payExpenses();
        }
    }

}