package collections.map.basics.HashMap.Practise;

import java.util.*;
import java.util.stream.Collectors;

public class OperationsOnString {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Mishika");
        names.add("Aditi");
        names.add("Punyam");
        names.add("Pinky");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(10);
        numbers.add(112);
        numbers.add(12);
        numbers.add(34);

        String[] arr = {"Apples","Mango","Bananas"};
        List<String> namesList = Arrays.asList(arr);

        System.out.println("Sorted strings"+ names.stream().sorted().toList());
        System.out.println("Sorted numbers" + numbers.stream().sorted(Integer::compare).toList());

        System.out.println("Reversed order sorting" + numbers.stream().sorted(Collections.reverseOrder()).toList());

        Collections.sort(namesList);

        System.out.println("Sorted nameslist" + namesList);

        System.out.println(namesList.get(0));

        System.out.println(numbers);

        Collections.sort(numbers);

        int index = Collections.binarySearch(numbers,15);

        System.out.println(index);

        numbers.sort(Comparator.comparingInt(Integer::intValue).reversed());

        numbers.sort(Integer::compare);

    }
}
