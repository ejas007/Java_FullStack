package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddRemoveEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nilesh");
        Employee e2 = new Employee(2, "Hello");
        Employee e3 = new Employee(3, "Ritesh");
        Employee e4 = new Employee(4, "Tejasvi");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e1);
        employees.add(e2);
        employees.add(e2);

        System.out.println("List of Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Set<Employee> employeeSet = new HashSet<>(employees);

        System.out.println("Unique Employees:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}
