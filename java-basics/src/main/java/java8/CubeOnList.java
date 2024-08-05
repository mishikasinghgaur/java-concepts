package java8;

import java.util.Arrays;
import java.util.List;

public class CubeOnList {

    public static void main(String[] args){
        List<Integer> integers = Arrays.asList(1,2,3,4,5);

        integers
                .stream()
                .map(x->x*x*x)
                .filter(i->i>50)
                .forEach(System.out::println);
    }
}
