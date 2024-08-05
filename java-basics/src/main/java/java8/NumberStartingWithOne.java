package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(11,21,14,71,18);

        System.out.println(numbers.stream().map(s->s + "").filter(s ->s.startsWith("1")).collect(Collectors.toList()));
    }
}
