package java8;

import java.util.Arrays;
import java.util.List;

public class MapToUppercase {

    public static void main(String[] args){
        List<String> arr = Arrays.asList("ssd","sadd","dadad");

        arr.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
