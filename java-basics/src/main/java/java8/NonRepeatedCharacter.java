package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {
    public static void main(String[] args){
        String input = "Mishika";

        Character s = input.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println(s);
    }
}
