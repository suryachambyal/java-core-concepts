package J13_FunctionalProgramming.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

public class EmployeeFilterExample {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Adam", 50000),
                new Employee(2, "Bob", 70000),
                new Employee(3, "Charlie", 40000)
        );

        List<Employee> result = employees.stream()
                .filter(emp -> emp.salary > 45000)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}