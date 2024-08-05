package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElement {

    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().max(Integer::compare).get());

        int[] arr = {1,2,44,56,211};
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
