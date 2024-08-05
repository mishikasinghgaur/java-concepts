package java8;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args){
        TreeMap<Integer, Double> curve = new TreeMap<>();
        curve.put(1,2.5);
        curve.put(3,3.5);
        curve.put(5,4.7);
        curve.put(10,5.1);
        curve.put(12,6.2);

        System.out.println(curve);

        //Question 1: Given the instrument's maturity, find the correct spread from the map and derive the new price by adding price to spread
        double instrumentMaturity = 15;
        double instrumentPrice = 2.5;

        // Find the next smallest greater key in the curve map
        Integer nextSmallestGreaterKey = curve.higherKey((int) instrumentMaturity);

        // If the nextSmallestGreaterKey is not found, set it to the maximum key in the map
        if (nextSmallestGreaterKey == null) {
            nextSmallestGreaterKey = curve.lastKey();
        }

        // Get the spread value corresponding to the nextSmallestGreaterKey
        double spread = curve.get(nextSmallestGreaterKey);

        // Calculate the new price by adding the spread and 4.5 to it
        double newPrice =  spread + 4.5;

        System.out.println(newPrice);




    }
}
