package estudoProvaN12.application;

import estudoProvaN12.src.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("João");
        Employee emp2 = new Employee("Isa", 1500);
        Employee emp3 = new Employee("Cris", 7000000, "Centro");

        emp1.printEmployee();
        emp2.printEmployee();
        emp3.printEmployee();
    }
}
