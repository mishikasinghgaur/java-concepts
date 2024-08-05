package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,4,7,8);

        System.out.println(numbers.stream().filter(a-> a%2 ==0).collect(Collectors.toList()));
    }
}
