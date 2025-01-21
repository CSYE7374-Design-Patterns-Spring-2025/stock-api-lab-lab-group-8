package edu.neu.csye7374.model;
import java.util.List;

public class Apple  extends Stock{

    public Apple(String name, double price, String description, List<Double> previousPrices) {
        super();
        setName(name);
        setPrice(price);
        setDescription(description);
        setPreviousPrices(previousPrices);
    }
    @Override
    public String getMetric() {
        double performance = 0.0;
        double weight = 1.0;
        double weightIncrement = 0.2;

        List<Double> lastSixPrices = getPreviousPrices().subList(Math.max(0, getPreviousPrices().size() - 6), getPreviousPrices().size());

        for (double price : lastSixPrices) {
            performance += (price - getPrice()) * weight;
            weight += weightIncrement;
        }

        return String.format("%.2f", performance);
    }
}
