package Practical3;

abstract class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    abstract public double calcSalary();
}

class Manager extends Employee {
    private double profit;

    public Manager(String name, double baseSalary, double profit) {
        super(name, baseSalary);
        this.profit = profit;
    }

    public double calcSalary() {
        return getBaseSalary() + (0.1 * profit);
    }
}

class CasualEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public CasualEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calcSalary() {
        return this.hourlyRate * this.hoursWorked;
    }
}

public class TestEmployee {
    public static void displaySalary(Employee[] employeeArr) {
        for (int i = 0; i < employeeArr.length; i++) {
            System.out.println(
                "Name: " + employeeArr[i].getName() + "\n" +
                "Salary: $" + employeeArr[i].calcSalary() + "\n"
            );
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new CasualEmployee("John", 10.0, 30);
        employees[1] = new CasualEmployee("Mary", 5.0, 50);
        employees[2] = new Manager("Peter", 3000.0, 5000.0);
        
        displaySalary(employees);
    }
}
