package collections.map.basics.LinkedHashMap;

import java.util.*;

public class LinkedHashMapBasics<S, I extends Number> extends HashMap {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> m = new LinkedHashMap<String, Integer>();

        String[] m1 = {"a","a","b","n","x","n","v","c",};

        for(String m2:m1){
            Integer freq = m.get(m2);
            m.put(m2,(freq==null)? 1: freq+1);
        }

        System.out.println(m.containsKey("a"));
        System.out.println(m.containsKey("z"));
        System.out.println(m.keySet());
        System.out.println(m.entrySet());
        System.out.println(m.values());
        System.out.println(m.get("a"));

        for (Map.Entry<String, Integer> e : m.entrySet())
            System.out.println(e.getKey() + ": " + e.getValue());

        //collection views
        m.keySet().removeIf(s -> s.equals("n"));

        for (Map.Entry<String, Integer> e : m.entrySet())
            System.out.println(e.getKey() + ": " + e.getValue() + "after removing");


        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);

        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);

    }
}
