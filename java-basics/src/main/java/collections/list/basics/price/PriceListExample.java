package collections.list.basics.price;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriceListExample {
    public static void main(String[] args) {
        PriceListUpdater updater = new PriceListUpdater();

        List<Double> newPrices = new ArrayList<>(Arrays.asList(100.0, 20.0, 40.0,50.0));
        updater.updatePrices(newPrices);


    }
}
