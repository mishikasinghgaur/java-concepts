package collections.list.basics.price;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class PriceListUpdater {

        private final AtomicReference<List<Double>> pricesRef = new AtomicReference<>(new CopyOnWriteArrayList<>());

        public void updatePrices(List<Double> newPrices) {
            List<Double> newImmutablePrices = List.copyOf(newPrices); // Create an immutable copy
            pricesRef.set(newImmutablePrices); // Atomically update the reference
        }

        public List<Double> getPrices() {
            return pricesRef.get(); // Get the current list of prices
        }
    }


