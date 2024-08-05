package collections.list.basics.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface {
    public static void main(String [] args){
        List<String> s = new ArrayList<String>(Arrays.asList("A","B","C"));
        System.out.println(s);
        System.out.println("Does the list contain A?" + s.contains("A"));

        s.removeIf(c -> c.charAt(0) == 'A');
        System.out.println("Does the list contain A?" + s.contains("A"  ));

//        s.sort();
    }
}

