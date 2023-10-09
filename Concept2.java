/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concept2;
import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Employee class represents an employee in an organization
class Employee {
    private String name;
    private Department department;  // Aggregation - Employee has a Department

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
class Organization {
    private List<Employee> employees;

    public Organization() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees:");

        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Department: " + employee.getDepartment().getName());
        }
    }
}

public class Concept2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Department hrDepartment = new Department("Human Resources");
        Department itDepartment = new Department("Information Technology");

        // Create employees and associate them with departments
        Employee employee1 = new Employee("Alice", hrDepartment);
        Employee employee2 = new Employee("Bob", itDepartment);

        // Create an organization and add employees
        Organization organization = new Organization();
        organization.addEmployee(employee1);
        organization.addEmployee(employee2);

        // Display employees and their departments
        organization.displayEmployees();
    }
}
