package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion {

    public static void main(String[] args){

        List<String> names = new ArrayList<>(Arrays.asList("Mrunali","Mishika","Punyam","Punyam","Anshika","Dobby"));

        names.add("Tara");

        List<String> names1 = new ArrayList<>(Arrays.asList("Mishika","Punyam","Anshika"));

        System.out.println(names.contains("Tara"));

        System.out.println(names.get(0));

        System.out.println(new HashSet<>(names).containsAll(names1));

        System.out.println(names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList()));

        System.out.println(names
                .stream()
                .max((str1,str2)->Integer.compare(str1.length(),str2.length()))
                        .orElse("Mishika")
                .toLowerCase());

        System.out.println(names.stream().filter(str -> str.contains("uny")).collect(Collectors.toList()));

        System.out.println(names.stream().distinct().collect(Collectors.toList()));

        System.out.println(names.size());

        System.out.println(names.hashCode());

    }

}
