package edu.neu.csye7374;

public class AmazonStock extends Stock {
    private double metric;

    public AmazonStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        this.price += bidValue;
        this.metric = this.price * 0.3;
    }

    @Override
    public String getMetric() {
        return String.valueOf(this.metric);
    }
}