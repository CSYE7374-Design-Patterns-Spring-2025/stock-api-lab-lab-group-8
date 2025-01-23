package edu.neu.csye7374;

public class StockMarketDemo {
    public static void demo() {
        StockMarket stockMarket = StockMarket.getInstance();
        AmazonStock amazonStock = new AmazonStock("Amazon", 150.51, "Amazon Inc.");
        ChewyStock netflixStock = new ChewyStock("Netflix", 200.23, "Netflix Inc.");
        AmexStock amexStock = new AmexStock("AMX", 100.0, "American Express", 0.10);
        AppleStock appleStock = new AppleStock("AAPL", 200.0, "Nvidia Corporation", 0.25);
        stockMarket.addStock(amazonStock);
        stockMarket.addStock(netflixStock);
        stockMarket.addStock(amexStock);
        stockMarket.addStock(appleStock);
        System.out.println("Current stocks added to the stock market: ");
        stockMarket.showAllStocks();
        System.out.println();
        double[] amazonBids = new double[]{155.0, 140.0, 138.0, 145.0, 150.0, 155.0};
        double[] netflixBids = new double[]{205.0, 190.0, 195.0, 210.0, 215.0, 200.0};
        double[] amexBids = new double[]{105.0, 102.0, 108.0, 106.0, 110.0, 107.0};
        double[] appleBids = new double[]{205.0, 202.0, 208.0, 206.0, 210.0, 207.0};
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
        System.out.println("Starting trading Amex Stock");
        for (double bid : amexBids) {
            System.out.println("\nPlacing bid for AMX: " + bid);
            stockMarket.tradeStock(amexStock, bid);
            System.out.println("AMX metric: " + amexStock.getMetric());
            System.out.println(amexStock);
        }

        System.out.println();
        System.out.println("Starting trading Apple Stock");
        for (double bid : appleBids) {
            System.out.println("\nPlacing bid for AAPL: " + bid);
            stockMarket.tradeStock(appleStock, bid);
            System.out.println("AAPL metric: " + appleStock.getMetric());
            System.out.println(appleStock);
        }


        System.out.println();
        System.out.println("All stocks in the market with current price after bids: ");
        stockMarket.showAllStocks();
        stockMarket.removeStock(netflixStock);
        System.out.println();
        System.out.println("Current stocks in stock market after removing a stock: ");
        stockMarket.showAllStocks();
    }
}
