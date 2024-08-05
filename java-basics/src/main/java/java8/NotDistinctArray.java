package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotDistinctArray {

    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(10,15,8,49);

        boolean flag = false;

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int n: myList){
            int count = hash.get(n);
            hash.put(n,count>1?count++:1);
        }

        if(!hash.containsValue(1)){
            flag = true;
        }

        System.out.println(flag);
    }
}
