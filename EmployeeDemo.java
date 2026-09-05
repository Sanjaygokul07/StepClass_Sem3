class Employee {
    String empId;
    double salary;

    Employee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    void printSalary() {
        System.out.println(empId + " | Final Salary: Rs " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        String[] ids = {"E-101", "E-102", "E-103", "E-104"};
        double[] salaries = {40000, 55000, 62000, 48000};

        Employee[] employees = new Employee[ids.length];
        for (int i = 0; i < ids.length; i++) {
            employees[i] = new Employee(ids[i], salaries[i]);
        }

        for (int i = 0; i < employees.length; i++) {
            employees[i].raiseSalary(5000);
            employees[i].printSalary();
        }
    }
}