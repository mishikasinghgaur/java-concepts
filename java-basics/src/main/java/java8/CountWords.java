package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args){
        List<String> names = Arrays.asList("AA","BB","CC","AA");

        System.out.println(names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
}
