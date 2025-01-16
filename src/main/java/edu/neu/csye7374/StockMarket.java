package edu.neu.csye7374;

public class StockMarket {
    private static StockMarket instance;
    private List<Stock> stockList = new ArrayList();

    private StockMarket() {
    }

    public static synchronized StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }

        return instance;
    }

    public void addStock(Stock stock) {
        this.stockList.add(stock);
    }

    public void tradeStock(Stock stock, double bid) {
        if (stock != null) {
            stock.setBid(bid);
            stock.setPrice((double)stock.getMetric());
        }

    }

    public void removeStock(Stock stock) {
        this.stockList.remove(stock);
    }

    public void showAllStocks() {
        Iterator var1 = this.stockList.iterator();

        while(var1.hasNext()) {
            Stock stock = (Stock)var1.next();
            System.out.println(stock.toString());
        }

    }
}
