package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private String fullName;
    private Integer age;
    private String department;
    private Double salary;

    public Employee(String fullName, Integer age, String department, Double salary) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

public class RichEmployeeFinder {

    public static void main(String[] args) {

        var salaryBound = 100000.00;

        List<Employee> employees = new ArrayList<>(5);

        employees.add(new Employee("Natalie Saler", 21, "QA", 100.00));
        employees.add(new Employee("Liz Kovtun", 28, "DevOps", 130000.00));
        employees.add(new Employee("John Snow", 40, "Design", 110000.00));
        employees.add(new Employee("Jane Smith", 56, "Interdimensional Travel", 8500000.88));
        employees.add(new Employee("Richard Nate", 33, "Marketing", 9999999.99));

        List<Employee> richEmployees = employees.stream()
                .filter(e -> e.getSalary() > salaryBound)
                .toList();


        System.out.println("Employees with salary > 100000.00:");
        richEmployees.forEach(employee ->
                System.out.println(employee.getFullName() + " --- " + employee.getSalary()));

    }
}

