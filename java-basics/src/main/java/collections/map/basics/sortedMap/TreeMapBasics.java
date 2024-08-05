package collections.map.basics.sortedMap;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMapBasics {

    public static void main(String[] args) {

        // Creating a treemap with a customized comparator
        Map<String, Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("Fourth", 4);
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);

        System.out.println("TreeMap: " + numbers
                .entrySet()
                .stream()
                .filter(a->a.getKey().startsWith("F"))
                .collect(Collectors.toSet()));

    }

    public static class CustomComparator implements
            Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int val = o1.compareTo(o2);
            return Integer.compare(val, 0);
        }
    }
}
