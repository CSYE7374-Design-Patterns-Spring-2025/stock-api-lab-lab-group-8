package edu.neu.csye7374.model;

public class TechStock extends Stock {

    public TechStock(String name, double price, String description) {
        super.setName(name);
        super.setPrice(price);
        super.setDescription(description);
    }

    @Override
    public void setBid(String bid) {
        try {
            double bidValue = Double.parseDouble(bid);
            setPrice(getPrice() + bidValue); // Updates the current price and adds it to previousPrices
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid format for TechStock: " + bid);
        }
    }

    @Override
    public String getMetric() {
        // Performance metric specific to TechStock
        double performanceMetric = getPrice() * 0.05; // Example calculation
        return "TechStock Performance Metric: " + performanceMetric;
    }
}
