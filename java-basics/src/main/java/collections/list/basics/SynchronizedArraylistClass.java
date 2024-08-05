package collections.list.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArraylistClass {
    public static void main(String[] args) {
        // Non Synchronized ArrayList
        List<String> list = new ArrayList<String>();

        list.add("Eat");
        list.add("Coffee");
        list.add("Code");
        list.add("Sleep");
        list.add("Repeat");

        list = Collections.synchronizedList(list);

        synchronized (list) {

            for (String s : list) {
                System.out.print(s);
            }
        }
    }
}
