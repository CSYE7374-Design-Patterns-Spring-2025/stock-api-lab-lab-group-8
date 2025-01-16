package edu.neu.csye7374;

public abstract class Tradeable1 implements Tradeable {
    private double price;
    private double bid;
    private int metric;

    public Tradeable1() {
    }

    public int getMetric() {
        this.metric = (int)((this.bid - this.price) / this.price) * 100;
        return this.metric;
    }
}
