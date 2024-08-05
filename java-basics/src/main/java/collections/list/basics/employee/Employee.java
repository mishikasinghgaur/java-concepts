package collections.list.basics.employee;

public class Employee {

    String employeeId;
    String employeeName;
    Double monthlySalary;
    Double annualSalary;
    Double bonus;
    Employee(String id, String name, Double salaryMonthly, Double salaryAnnual, Double bonus){
        this.employeeId = id;
        this.employeeName = name;
        this.monthlySalary = salaryMonthly;
        this.annualSalary = salaryAnnual;
        this.bonus = bonus;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBonus(){
        return bonus;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
