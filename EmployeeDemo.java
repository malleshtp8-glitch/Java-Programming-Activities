class Employee {
    void calculateSalary() {
        System.out.println("Salary Calculation");
    }
}

class FullTimeEmployee extends Employee {

    int monthlySalary = 50000;

    @Override
    void calculateSalary() {
        System.out.println("Full Time Employee Salary = "
                + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {

    int hoursWorked = 40;
    int ratePerHour = 300;

    @Override
    void calculateSalary() {
        System.out.println("Part Time Employee Salary = "
                + (hoursWorked * ratePerHour));
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}