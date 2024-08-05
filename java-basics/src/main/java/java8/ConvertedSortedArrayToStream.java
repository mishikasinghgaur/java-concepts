package java8;

import java.util.Arrays;

public class ConvertedSortedArrayToStream {
    public static void main(String[] args){

        int[] arr = {13,456,73,1,24,55};

        Arrays.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
