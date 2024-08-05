package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectsToMap {
    public static void main(String[] args){
        List<String> noteLst = new ArrayList<>();
        noteLst.add("11");
        noteLst.add("1");
        noteLst.add("2");
        noteLst.add("2");
        noteLst.add("9");
        noteLst.add("3");

        noteLst.stream()
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
