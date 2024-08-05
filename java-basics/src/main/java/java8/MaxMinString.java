package java8;

import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MaxMinString {

    public static void main(String[] args){
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("Mishika","is","a","good","girl");

        // Find the longest string in the Stream
        String longestString = streamSupplier.get().max(Comparator.comparingInt(String::length)).get();

        // Find the shortest string in the Stream
        String shortestString = streamSupplier.get().min(Comparator.comparingInt(String::length)).get();

        System.out.println("Longest string: " + longestString);

        System.out.println("Shortest string: " + shortestString);

    }
}
