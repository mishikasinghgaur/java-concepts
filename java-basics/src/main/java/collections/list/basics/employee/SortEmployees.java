//package collections.list.basics.employee;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class SortEmployees {
//    public static void main(String[] args){
//        List<Employee> emp = new ArrayList<Employee>();
//
//        emp.add(new Employee("Aditya", 80000.00));
//        emp.add(new Employee("Parth", 90000.00));
//        emp.add(new Employee("Sarthak", 5000.00));
//        emp.add(new Employee("Romi", 45000.00));
//
//        List<Employee> sortedEmployees = emp.stream().sorted(Comparator.comparingDouble(Employee::getMonthlySalary)).collect(Collectors.toList());
//
//        for(Employee e : sortedEmployees) {
//            System.out.println(e.getMonthlySalary());
//        }
//
//        int min = 0;
//        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        int sum = num.stream().reduce(min, Integer::sum);
//        System.out.println("The sum is" + sum);
//    }
//}
