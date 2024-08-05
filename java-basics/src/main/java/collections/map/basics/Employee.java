package collections.map.basics;

import java.util.Objects;

public class Employee {

    String employeeId;
    String employeeName;
    Double monthlySalary;
    Double annualSalary;
    Double bonus;


    public Employee(String id, String name, Double salaryMonthly, Double salaryAnnual, Double bonus){
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

    // HashCode Method
    public int hashCode()
    {
        System.out.println("In hashcode method");
        int hashcode = 0;
        return hashcode;
    }

    // Equals Method
    public boolean equals(Object obj)
    {
        System.out.println("In equals method");
        if (obj instanceof Employee emp) {
            return (emp.employeeName.equals(this.employeeName)
                    && Objects.equals(emp.employeeId, this.employeeId));
        }
        else {
            return false;
        }
    }
}
