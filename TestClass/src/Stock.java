public class Stock {

    private String symbol;
    private double currentPrice;

    public Stock(String sym, double price) {
        symbol = sym;
        currentPrice = price;
    }

    public Stock(Stock stockObject) {
        symbol = stockObject.getSymbol();
        currentPrice = stockObject.getPrice();
    }

    public Stock(String symbol) {
        this(symbol, 0.0);
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return currentPrice;
    }

    public String toString() {
        return "The stock's symbol is: " + getSymbol() +
                "\nThe stock's current price is: " + getPrice();
    }

    public boolean equals(Stock stockObject) {
        if (currentPrice == stockObject.getPrice() && getSymbol().equals(stockObject.getSymbol())) {
            return true;
        }
        else {
            return false;
        }
    }

    public Stock copyObject() {
        Stock newStock = new Stock(symbol, currentPrice);
        return newStock;
    }

}
