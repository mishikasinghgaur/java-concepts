package collections.map.basics.LinkedHashMap;

import collections.map.basics.Employee;

import java.util.LinkedHashMap;
import java.util.Map;

//How to Eliminate Duplicate User Defined Objects as a Key from Java LinkedHashMap?
//Input : LinkedHashMap = [{[Apple, 40], Kashmir}, {[Grapes, 80], Nashik}]
//Duplicate key = {[Grapes, 80], Delhi}
//Output: LinkedHashMap = [{[Apple, 40], Kashmir}, {[Grapes, 80], Delhi}]
public class EliminateDuplicate {
    public static void main(String[] args){
        LinkedHashMap<Integer, Employee> lhm
                = new LinkedHashMap<Integer, Employee>();

        lhm.put(1, new Employee("123","Aditya",12340.00,0.0,123.00));
        lhm.put(2, new Employee("234","Romi",98340.00,0.0,4567.00));
        lhm.put(3, new Employee("876","Teresa",67840.00,0.0,120.00));
        lhm.put(4, new Employee("129","Mishika",100340.00,0.0,12390.00));

        for(Map.Entry<Integer, Employee> e: lhm.entrySet()){
            System.out.println(e.getKey() + "==>" + e.getValue());
        }

        Employee duplicate = new Employee("123","Mishika",12340.00,0.0,123.00);
        System.out.println("Inserting duplicate record..." + duplicate);
        lhm.put(1, duplicate);

        for(Map.Entry<Integer, Employee> e: lhm.entrySet()){
            System.out.println(e.getKey() + "==>" + e.getValue());
        }
    }
}
