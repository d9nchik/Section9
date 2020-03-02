package exercise2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol, String name, double previousClosingPrice){
        this.symbol=symbol;
        this.name=name;
        this.previousClosingPrice=previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getChangePercent(){
        return 100*(currentPrice/previousClosingPrice-1);
    }
}
