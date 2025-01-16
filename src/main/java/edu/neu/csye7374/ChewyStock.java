package edu.neu.csye7374;

public class ChewyStock extends Stock {
        private double bid;

        public ChewyStock(String name, double price, String description) {
            super(name, price, description);
        }

        public void setBid(double bid) {
            this.bid = bid;
        }

        public int getMetric() {
            return (int)this.bid + 5;
        }
    }
}
