package collections.list.basics.employee;

import java.util.*;
import java.util.stream.Collectors;

public class AnnualSalary {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("123","Aditya",12340.00,0.0,123.00));
        employees.add(new Employee("234","Romi",98340.00,0.0,4567.00));
        employees.add(new Employee("876","Teresa",67840.00,0.0,120.00));
        employees.add(new Employee("129","Mishika",100340.00,0.0,12390.00));

       employees.stream()
                .map(s->{
                    s.setAnnualSalary((s.getMonthlySalary() * 12) + s.bonus);
                    return s;
                })
                .filter(s->s.getAnnualSalary() > 1000000.00)
                .sorted(Comparator.comparingDouble(Employee::getAnnualSalary).reversed())
                .forEach(s->{
                    System.out.println("Employee" + s.getEmployeeName() + "has salary" + s.getAnnualSalary());
                });


        Optional<Employee> getEmployeeId = employees.stream().filter(s->s.getEmployeeId().equals("1233")).findFirst();

        if(getEmployeeId.isPresent()){
            System.out.println("Employee ID is present");
        }
        else {
            System.out.println("Employee ID is not present");
        }

        boolean employeeIdWithinRange = employees.stream()
                .allMatch(s-> (Objects.equals(s.getEmployeeId(),"1234") || Objects.equals(s.getEmployeeId(),"123")));



        //OR

//        employees.forEach(s -> s.setAnnualSalary((s.getMonthlySalary()*12)+s.bonus));
//
//        for(Employee e: employees){
//            System.out.println(e.annualSalary);
//        }
//
//        //Find all annual salaries greater than 10L
//        List<Employee> salaryGreaterThanTenLakh = employees.stream().filter(s->s.getAnnualSalary() > 1000000.00).collect(Collectors.toList());
//
//        for(Employee e: salaryGreaterThanTenLakh){
//            System.out.println(e.getEmployeeName() + "'s salary is" + e.getAnnualSalary() + "which is greater than 10 Lakh");
//        }
//
//        //Top three employees drawing the highest salary
//        List<Employee> topThreeEmployees = employees.stream()
//                .sorted(Comparator.comparingDouble(Employee::getAnnualSalary).reversed())
//                .limit(3)
//                .collect(Collectors.toList());

//        for(Employee e: employeeWithAnnualSalary){
//            System.out.println(e.getEmployeeName() + "'s salary is" + e.getAnnualSalary() + "which is amonsgt the top three salaries");
//        }
    }
}
