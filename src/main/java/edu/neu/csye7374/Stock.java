package edu.neu.csye7374;

public abstract class Stock implements Tradeable {
    private String name;
    private double price;
    private String description;

    public Stock(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return "Stock{name='" + this.name + "', price=" + this.price + ", description='" + this.description + "'}";
    }