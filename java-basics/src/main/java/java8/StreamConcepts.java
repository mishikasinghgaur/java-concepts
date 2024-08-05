package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamConcepts {

        static int counter = 0;
        public static void wasCalled(){
                counter++;
        }

        public static void main(String[] args){
                Stream<String> streamBuilder = Stream.<String>builder().add("C1").add("C2").add("C3").add("C4").build();

                Stream<String> generated = Stream.generate(()-> "elements").limit(10);

                System.out.println(generated.collect(Collectors.toList()));

                Stream<Integer> str = Stream.iterate(20,integer -> integer+1).limit(20);

                System.out.println(str.collect(Collectors.toList()));

                LongStream longStream = LongStream.rangeClosed(1, 3);


                List<String> list = Arrays.asList("abc1", "abc2", "abc3");
                long size = list.stream().skip(2).map(element -> {
                        wasCalled();
                        return element.substring(0, 3);
                }).count();

                System.out.println(size);


        }
}
