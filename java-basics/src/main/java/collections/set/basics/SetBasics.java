package collections.set.basics;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetBasics {

    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("b");
        set.add("c");

        System.out.println(set);

        Object a = "n";
        Object b = "m";
        System.out.println(Objects.equals(a,b));
    }
}
