package collections.map.basics.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapBasics {
    public static void main(String [] args){

        //create a hashmap
        //While creating a hashmap, we can include optional parameters: capacity and load factor. For example,
        HashMap<String,Integer> values = new HashMap<>(8,0.6f);

        //8 is the capacity, that means the Hashmap can store 8 entreis
        //0.6f is the load factor, which indicates that whenever our hash table is filled by 60%,
        // the entries are moved to a new hash table double the size of the original hash table.


        //If the optional parameters not used, then the default capacity will be 16
        // and the default load factor will be 0.75.

        //add elements using put
        values.put("1",9);
        values.put("2",8);
        values.put("3",56);

        System.out.println(values);




        // add mappings to HashMap using putAll
        HashMap<String, Integer> primeNumbers = new HashMap<>();
        primeNumbers.put("Two", 2);
        primeNumbers.put("Three", 3);
        System.out.println("Prime Numbers: " + primeNumbers);

        // create another HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 22);

        // Add all mappings from primeNumbers to numbers
        numbers.putAll(primeNumbers);
        System.out.println("Numbers: " + numbers);




        //TreeMap to HashMap
        // create a TreeMap of String type
        TreeMap<String, String> treemap = new TreeMap<>();

        // add mappings to the TreeMap
        treemap.put("A", "Apple");
        treemap.put("B", "Ball");
        treemap.put("Y", "Cat");
        System.out.println("TreeMap: " + treemap);

        // create a HashMap
        HashMap<String, String> hashmap = new HashMap<>();

        // add mapping to HashMap
        hashmap.put("Y", "Yak");
        hashmap.put("Z", "Zebra");
        System.out.println("Initial HashMap: " + hashmap);

        // add all mappings from TreeMap to HashMap
        hashmap.putAll(treemap);
        System.out.println("Updated HashMap: " + hashmap);




        //PutIfAbsent
        // create a HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        // add mappings to HashMap
        languages.put(1, "Python");
        languages.put(2, "C");
        languages.put(3, "Java");
        System.out.println("Languages: " + languages);

        // key already not present in HashMap
        languages.putIfAbsent(4, "JavaScript");

        // key already present in HashMap
        languages.putIfAbsent(2, "Swift");
        System.out.println("Updated Languages: " + languages);


        //Access the elements within TreeMap
        HashMap<Integer, String> lang = new HashMap<>();
        lang.put(1, "Java");
        lang.put(2, "Python");
        lang.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        // get() method to get value
        String value = lang.get(6);
        System.out.println("Value at index 1: " + value);

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + lang.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + lang.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + lang.entrySet());

        //getOrDefault
        String value1 = lang.getOrDefault(2,"Not Found");
        String value2 = lang.getOrDefault(4,"Room");
        System.out.println(value1);
        System.out.println(value2);

        lang.forEach((K,V)->{
            V = V + "A";
            System.out.println(K + V);
        });
    }
}
