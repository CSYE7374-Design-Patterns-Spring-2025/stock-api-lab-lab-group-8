package edu.neu.csye7374;

public class AppleStock extends Stock{
    private double volatilityFactor;

    public AppleStock(String name, Double price, String description, double volatilityFactor) {
        super(name, price, description);
        this.volatilityFactor = volatilityFactor;
    }

    public void setBid(String bid) {
        Double stockBid = Double.parseDouble(bid);
        bidHistory.add(stockBid);
        double priceDiff = stockBid - price;
        price = stockBid + (priceDiff * volatilityFactor);
    }

    public String getMetric() {
        if (bidHistory.isEmpty()) return "0.0";
        double sum = 0;
        for (int i = 1; i < bidHistory.size(); i++) {
            sum += Math.abs(bidHistory.get(i) - bidHistory.get(i-1));
        }
        return String.valueOf(bidHistory.size() > 1 ? sum / (bidHistory.size() - 1) : 0.0);
    }
}
