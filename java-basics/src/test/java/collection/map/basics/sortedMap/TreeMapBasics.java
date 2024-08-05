package collection.map.basics.sortedMap;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeMapBasics {

    @Test
    public void givenTreeMap_whenOrdersEntriesNaturally_thenCorrect(){
        TreeMap<String, Integer> tree = new TreeMap<>();

        tree.put("B",2);
        tree.put("C",3);
        tree.put("A",1);

        System.out.println(tree.descendingMap());
        System.out.println(tree.entrySet());
        assertEquals("[1, 2, 3]", tree.values().toString());
        assertEquals("[A, B, C]", tree.keySet().toString());
        assertEquals("[A=1, B=2, C=3]",tree.entrySet().toString());
    }

    @Test
    public void givenTreeMap_whenOrderingUsingComparator_thenReverse(){

        TreeMap<String, Integer> tree = new TreeMap<>(Comparator.reverseOrder());

        tree.put("B",2);
        tree.put("C",3);
        tree.put("A",1);

        assertEquals("[C, B, A]", tree.keySet().toString());
        assertEquals("[1, 2, 3]", tree.values().toString());

    }

    @Test
    public void givenAGenericArray_whenTheElementsAreMixed_thenCorrect(){

        ArrayList<String> arr = new ArrayList<>();

        ArrayList arr1 = new ArrayList<String>();

        arr.add("a");
        arr.add("b");
        arr.add("c");

        //Generic Arraylist, accept ant type of elements
        arr1.add(1);
        arr1.add("2");
        arr1.add("#");

        System.out.println(arr);
        System.out.println(arr1);
    }
}
