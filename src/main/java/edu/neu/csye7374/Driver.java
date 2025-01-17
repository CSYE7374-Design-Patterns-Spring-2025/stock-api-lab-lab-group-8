package edu.neu.csye7374;

/**
 * 
 * @author Tirth Naik
 * 
 */

public class Driver {
    public Driver() {
    }

    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");
        StockMarket stockMarket = StockMarket.getInstance();
        AmazonStock amazonStock = new AmazonStock("Amazon", 150.51, "Amazon Inc.");
        ChewyStock netflixStock = new ChewyStock("Netflix", 200.23, "Netflix Inc.");
        stockMarket.addStock(amazonStock);
        stockMarket.addStock(netflixStock);
        System.out.println("Current stocks added to the stock market: ");
        stockMarket.showAllStocks();
        System.out.println();
        double[] amazonBids = new double[]{155.0, 140.0, 138.0, 145.0, 150.0, 155.0};
        double[] netflixBids = new double[]{205.0, 190.0, 195.0, 210.0, 215.0, 200.0};
        System.out.println("Starting trading Amazon Stock");
        double[] var6 = amazonBids;
        int var7 = amazonBids.length;

        int var8;
        double netflixBid;
        for(var8 = 0; var8 < var7; ++var8) {
            netflixBid = var6[var8];
            stockMarket.tradeStock(amazonStock, netflixBid);
            System.out.println(amazonStock);
            System.out.println("Stock metric after bid: " + amazonStock.getMetric());
        }

        System.out.println();
        System.out.println("Starting trading Netflix Stock");
        var6 = netflixBids;
        var7 = netflixBids.length;

        for(var8 = 0; var8 < var7; ++var8) {
            netflixBid = var6[var8];
            stockMarket.tradeStock(netflixStock, netflixBid);
            System.out.println(netflixStock);
            System.out.println("Stock metric after bid: " + netflixStock.getMetric());
        }

        System.out.println();
        System.out.println("All stocks in the market with current price after bids: ");
        stockMarket.showAllStocks();
        stockMarket.removeStock(netflixStock);
        System.out.println();
        System.out.println("Current stocks in stock market after removing a stock: ");
        stockMarket.showAllStocks();
        System.out.println("\n\n============Main Execution End===================");
   
    }
}



