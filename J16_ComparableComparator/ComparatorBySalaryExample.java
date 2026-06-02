package J16_ComparableComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class ComparatorBySalaryExample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Adam", 50000));
        employees.add(new Employee(2, "Bob", 70000));
        employees.add(new Employee(3, "Charlie", 40000));

        employees.sort(
                Comparator.comparingDouble(employee -> employee.salary)
        );

        System.out.println(employees);
    }
}