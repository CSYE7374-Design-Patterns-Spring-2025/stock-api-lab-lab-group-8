package edu.neu.csye7374;

public class AmazonStock extends Stock {
    private double bid;

    public AmazonStock(String name, double price, String description) {
        super(name, price, description);
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public int getMetric() {
        return (int)this.bid + 10;
    }
}