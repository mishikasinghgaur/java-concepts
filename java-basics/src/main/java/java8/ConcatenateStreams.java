package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateStreams {

    public static void main(String[] args){

        List<String> str1 = Arrays.asList("Java3","jdksh");

        List<String> str2 = Arrays.asList("1","2");

        Stream<String> streams = Stream.concat(str1.stream(),str2.stream());

        streams.forEach(System.out::println);
    }
}
