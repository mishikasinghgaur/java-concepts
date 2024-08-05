package collections.Strings;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
       String a = sc.nextLine();

       int len = a.length();

       HashMap<Character,Integer> strength = new HashMap<>();

       for (int i = 0; i < len; i++) {
           char ch = a.charAt(i);
           strength.put(ch, strength.getOrDefault(ch, 0) + 1) ;
        }

        strength.entrySet()
               .stream()
               .sorted(Entry.comparingByValue())
               .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1, e2)->e1, LinkedHashMap::new))
                .forEach((K,V)->{System.out.println("Key" + K + "Value" + V);});


    }

}
