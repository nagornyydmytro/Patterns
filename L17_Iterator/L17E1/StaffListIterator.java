package L17_Iterator.L17E1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {

    private final List<Employee> employees;
    private int position = 0;

    public StaffListIterator(List<Employee> employees) {
        this.employees = new ArrayList<>(employees);
        this.employees.sort(Comparator.comparing(Employee::getName));
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(position++);
    }
}