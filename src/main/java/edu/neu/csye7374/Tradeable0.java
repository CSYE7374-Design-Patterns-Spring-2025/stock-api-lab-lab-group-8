package edu.neu.csye7374;

public abstract class Tradeable0 implements Tradeable {
    private int metric;
    private double price;
    private double bid;

    public Tradeable0() {
    }

    public void setBid(double bid) {
        if (bid > this.bid) {
            this.bid = bid;
        }

    }

    public String getMetric() {
        this.metric = (int)((this.bid - this.price) / this.price) * 100;
        return String.valueOf(this.metric);
    }
}
