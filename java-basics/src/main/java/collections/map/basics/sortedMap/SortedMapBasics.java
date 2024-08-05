package collections.map.basics.sortedMap;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortedMapBasics {
//    public static <K,V extends Comparable<V>> Map<K,V> valueSort(final Map<K,V> m){
//        Comparator<K> valueComparator = new Comparator<K>() {
//            @Override
//            public int compare(K o1, K o2) {
//                return 0;
//
//
//            }
//        }
//    }
    public static void main(String[] args) {

        // Creating SortedMap using TreeMap
        SortedMap<Integer, String> numbers = new TreeMap<>();

        // Insert elements to map
        numbers.put(2, "Two");
        numbers.put(1, "One");
        numbers.put(5, "Four");

        System.out.println("SortedMap: " + numbers);

        long firstNumber = numbers.keySet().stream().mapToInt(s -> s).count();

        System.out.println("The total number of keys are" + firstNumber);

        //Sorting on SortedMap

        // Create a SortedMap (TreeMap) with keys in natural order
        SortedMap<String, Integer> studentScores = new TreeMap<>();
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 75);

        Comparator<Map.Entry<String, Integer>> scoreComparator = Map.Entry.comparingByValue();

        SortedMap<String, Integer> threshold = new TreeMap<>();
        threshold.put("Threshold", 85);

        SortedMap<String, Integer> filteredScores = studentScores
                .entrySet()
                .stream()
                .filter(s -> s.getValue() >= 85)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, TreeMap::new));


        for (Map.Entry<String, Integer> m : filteredScores.entrySet()) {
            System.out.println(m.getKey() + "==>" + m.getValue());
        }

        SortedMap<String, Integer> filteredScores1 = studentScores
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, TreeMap::new));


        for (Map.Entry<String, Integer> m : filteredScores1.entrySet()) {
            System.out.println(m.getKey() + "==>" + m.getValue());
        }

        //Print first key
        System.out.println("First Key: " + filteredScores.firstKey());

        //Print last key
        System.out.println("Last Key: " + filteredScores.lastKey());

        //Head map to print the entries before the key provided
        System.out.println("Headmap: " + filteredScores.headMap("Charlie"));

        //Tail map
        System.out.println("Tailmap: " + filteredScores.tailMap("Charlie"));

    }
}
